import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'dart:math';
import 'package:flutter_gen/gen_l10n/app_localizations.dart';

class RegisterPage extends StatefulWidget {
  const RegisterPage({super.key});

  @override
  _RegisterPageState createState() => _RegisterPageState();
}

class _RegisterPageState extends State<RegisterPage> {
  final TextEditingController _nameController = TextEditingController();
  final TextEditingController _dobController = TextEditingController();
  final TextEditingController _addressController = TextEditingController();
  final TextEditingController _emailController = TextEditingController();
  final TextEditingController _passwordController = TextEditingController();

  final CollectionReference users = FirebaseFirestore.instance.collection(
    'users',
  );

  String _generateRandomId() {
    final Random random = Random();
    return 'ID${random.nextInt(900000) + 100000}'; // Generates a 6-digit ID
  }

  void _registerUser() async {
    if (_nameController.text.isEmpty ||
        _dobController.text.isEmpty ||
        _addressController.text.isEmpty ||
        _emailController.text.isEmpty ||
        _passwordController.text.isEmpty) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(content: Text(AppLocalizations.of(context)!.fillAllFields)),
      );
      return;
    }

    // Validate email format
    String email = _emailController.text.trim().toLowerCase();
    if (!email.contains('@')) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(content: Text(AppLocalizations.of(context)!.invalidEmail)),
      );
      return;
    }

    // Validate password strength
    if (_passwordController.text.length < 6) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(content: Text(AppLocalizations.of(context)!.weakPassword)),
      );
      return;
    }

    String generatedId = _generateRandomId();

    try {
      print("Registering user: $email");

      await users.doc(email).set({
        // 🔥 Using email as the document ID!
        'name': _nameController.text,
        'dob': _dobController.text,
        'address': _addressController.text,
        'email': email,
        'password': _passwordController.text, // Hash in real apps
        'idNumber': generatedId,
      });

      print("User registered successfully: $email");

      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: Text(
            '${AppLocalizations.of(context)!.registerSuccess} ID: $generatedId',
          ),
        ),
      );

      _nameController.clear();
      _dobController.clear();
      _addressController.clear();
      _emailController.clear();
      _passwordController.clear();
    } catch (e) {
      print("Error registering user: $e");
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(content: Text(AppLocalizations.of(context)!.registerFailed)),
      );
    }
  }


  @override
  Widget build(BuildContext context) {
    var locale = AppLocalizations.of(context)!;

    return Scaffold(
      appBar: AppBar(title: Text(locale.register)),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            TextField(
              controller: _nameController,
              decoration: InputDecoration(labelText: locale.fullName),
            ),
            TextField(
              controller: _dobController,
              decoration: InputDecoration(labelText: locale.dob),
            ),
            TextField(
              controller: _addressController,
              decoration: InputDecoration(labelText: locale.address),
            ),
            TextField(
              controller: _emailController,
              decoration: InputDecoration(labelText: locale.email),
              keyboardType: TextInputType.emailAddress,
            ),
            TextField(
              controller: _passwordController,
              decoration: InputDecoration(labelText: locale.password),
              obscureText: true,
            ),
            const SizedBox(height: 20),
            ElevatedButton(
              onPressed: _registerUser,
              child: Text(locale.register),
            ),
          ],
        ),
      ),
    );
  }
}
