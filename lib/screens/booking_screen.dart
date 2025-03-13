import 'package:flutter/material.dart';
import 'package:flight_plan_flutter/services/database_service.dart';

class BookingScreen extends StatefulWidget {
  const BookingScreen({super.key});

  @override
  _BookingScreenState createState() => _BookingScreenState();
}

class _BookingScreenState extends State<BookingScreen> {
  final _formKey = GlobalKey<FormState>();
  String name = '';
  String email = '';
  String passport = '';

  @override
  Widget build(BuildContext context) {
    // Receiving flight details from Flight Details Screen
    final Map<String, String>? flight =
        ModalRoute.of(context)?.settings.arguments as Map<String, String>?;

    return Scaffold(
      appBar: AppBar(title: const Text('Book Your Flight')),
      body: Padding(
        padding: const EdgeInsets.all(20.0),
        child: Form(
          key: _formKey,
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              TextFormField(
                decoration: const InputDecoration(labelText: 'Full Name'),
                validator: (value) => value!.isEmpty ? 'Enter your name' : null,
                onSaved: (value) => name = value!,
              ),
              const SizedBox(height: 10),
              TextFormField(
                decoration: const InputDecoration(labelText: 'Email'),
                validator:
                    (value) =>
                        value!.contains('@') ? null : 'Enter a valid email',
                onSaved: (value) => email = value!,
              ),
              const SizedBox(height: 10),
              TextFormField(
                decoration: const InputDecoration(labelText: 'Passport Number'),
                validator:
                    (value) => value!.isEmpty ? 'Enter passport number' : null,
                onSaved: (value) => passport = value!,
              ),
              const SizedBox(height: 20),
              ElevatedButton.icon(
                onPressed: () async {
                  if (_formKey.currentState!.validate()) {
                    _formKey.currentState!.save();

                    // Save booking in database
                    await DatabaseService.insertBooking({
                      'name': name,
                      'email': email,
                      'passport': passport,
                      'flight_name': flight?['name'],
                      'flight_time': flight?['time'],
                      'flight_price': flight?['price'],
                    });

                    // Show confirmation message
                    ScaffoldMessenger.of(context).showSnackBar(
                      const SnackBar(content: Text('Booking Confirmed!')),
                    );

                    Navigator.pop(context);
                  }
                },
                icon: const Icon(Icons.check),
                label: const Text('Confirm Booking'),
                style: ElevatedButton.styleFrom(
                  padding: const EdgeInsets.symmetric(
                    vertical: 15,
                    horizontal: 30,
                  ),
                  textStyle: const TextStyle(fontSize: 18),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
