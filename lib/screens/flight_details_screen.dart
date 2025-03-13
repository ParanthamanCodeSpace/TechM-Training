import 'package:flutter/material.dart';

class FlightDetailsScreen extends StatelessWidget {
  const FlightDetailsScreen({super.key});

  @override
  Widget build(BuildContext context) {
    // Receiving flight details from Available Flights Screen
    final Map<String, String>? flight =
        ModalRoute.of(context)?.settings.arguments as Map<String, String>?;

    return Scaffold(
      appBar: AppBar(title: const Text('Flight Details')),
      body: Padding(
        padding: const EdgeInsets.all(20.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              flight?['name'] ?? 'Unknown Flight',
              style: const TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 10),
            Text(
              'Departure: ${flight?['time'] ?? 'N/A'}',
              style: const TextStyle(fontSize: 18),
            ),
            const SizedBox(height: 5),
            Text(
              'Price: ${flight?['price'] ?? 'N/A'}',
              style: const TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 40),
            Center(
              child: ElevatedButton.icon(
                onPressed: () {
                  Navigator.pushNamed(
                    context,
                    '/booking',
                    arguments:
                        flight, // Passing flight details to Booking Screen
                  );
                },
                icon: const Icon(Icons.book_online),
                label: const Text('Book Now'),
                style: ElevatedButton.styleFrom(
                  padding: const EdgeInsets.symmetric(
                    vertical: 15,
                    horizontal: 30,
                  ),
                  textStyle: const TextStyle(fontSize: 18),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
