import 'package:flutter/material.dart';
import 'package:flutter_gen/gen_l10n/app_localizations.dart';
import 'register_page.dart';
import 'login_page.dart';
import 'main.dart';

class HomePage extends StatelessWidget {
  final VoidCallback onLogout;

  const HomePage({super.key, required this.onLogout});

  @override
  Widget build(BuildContext context) {
    var locale = AppLocalizations.of(context)!;

    return Scaffold(
      appBar: AppBar(
        title: Text(locale.appTitle),
        actions: [
          DropdownButton<Locale>(
            onChanged: (Locale? newLocale) {
              if (newLocale != null) {
                MyApp.of(context)?.setLocale(newLocale);
              }
            },
            icon: const Icon(Icons.language),
            items: const [
              DropdownMenuItem(value: Locale('en', ''), child: Text('English')),
              DropdownMenuItem(value: Locale('ta', ''), child: Text('தமிழ்')),
            ],
          ),
        ],
      ),
      body: Stack(
        children: [
          // First Background Image (Full-Screen)
          Positioned.fill(
            child: Image.asset(
              "assets/images/bg1.webp", // Replace with your actual image
              fit: BoxFit.cover,
            ),
          ),

          /*// Second Image (Placed at the bottom)
          Positioned(
            bottom: 0,
            left: 0,
            right: 0,
            child: Image.asset(
              "assets/images/bg2.webp", // Replace with your actual image
              fit: BoxFit.cover,
              height: 150, // Adjust height as needed
            ),
          ),*/

          // Content (Buttons in Center)
          Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                ElevatedButton(
                  onPressed: () {
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (context) => const RegisterPage(),
                      ),
                    );
                  },
                  child: Text(locale.register),
                ),
                const SizedBox(height: 10),
                ElevatedButton(
                  onPressed: () {
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (context) => const LoginPage(),
                      ),
                    );
                  },
                  child: Text(locale.login),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
