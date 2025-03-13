import 'package:flutter/material.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Flight Plan'), centerTitle: true),
      body: Center(
        child: Padding(
          padding: const EdgeInsets.all(20.0),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              const Text(
                'Welcome to Flight Plan!',
                style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
              ),
              const SizedBox(height: 20),
              const Text(
                'Book your flights easily and track your bookings.',
                textAlign: TextAlign.center,
                style: TextStyle(fontSize: 16),
              ),
              const SizedBox(height: 40),
              ElevatedButton.icon(
                onPressed: () {
                  Navigator.pushNamed(context, '/search');
                },
                icon: const Icon(Icons.flight_takeoff),
                label: const Text('Search Flights'),
                style: ElevatedButton.styleFrom(
                  padding: const EdgeInsets.symmetric(
                    vertical: 15,
                    horizontal: 30,
                  ),
                  textStyle: const TextStyle(fontSize: 18),
                ),
              ),
              const SizedBox(height: 20),
              ElevatedButton.icon(
                onPressed: () {
                  Navigator.pushNamed(context, '/booking');
                },
                icon: const Icon(Icons.book),
                label: const Text('My Bookings'),
                style: ElevatedButton.styleFrom(
                  padding: const EdgeInsets.symmetric(
                    vertical: 15,
                    horizontal: 30,
                  ),
                  textStyle: const TextStyle(fontSize: 18),
                  backgroundColor: Colors.green,
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
