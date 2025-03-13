import 'package:flutter/material.dart';

class AvailableFlightsScreen extends StatelessWidget {
  const AvailableFlightsScreen({super.key});

  @override
  Widget build(BuildContext context) {
    // Receiving arguments from the search screen
    final Map<String, dynamic>? args =
        ModalRoute.of(context)?.settings.arguments as Map<String, dynamic>?;

    String from = args?['from'] ?? 'Unknown';
    String to = args?['to'] ?? 'Unknown';
    //String date = args?['date'] ?? 'Unknown';

    // Dummy flight data
    final List<Map<String, String>> flights = [
      {'name': 'Airways A1', 'time': '10:30 AM', 'price': '\$250'},
      {'name': 'SkyJet B2', 'time': '1:00 PM', 'price': '\$300'},
      {'name': 'FlyHigh C3', 'time': '4:45 PM', 'price': '\$280'},
    ];

    return Scaffold(
      appBar: AppBar(title: Text('Flights from $from to $to')),
      body: Padding(
        padding: const EdgeInsets.all(10.0),
        child: ListView.builder(
          itemCount: flights.length,
          itemBuilder: (context, index) {
            final flight = flights[index];

            return Card(
              margin: const EdgeInsets.symmetric(vertical: 10),
              elevation: 4,
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(10),
              ),
              child: ListTile(
                contentPadding: const EdgeInsets.all(15),
                title: Text(
                  flight['name']!,
                  style: const TextStyle(
                    fontSize: 18,
                    fontWeight: FontWeight.bold,
                  ),
                ),
                subtitle: Text(
                  'Departure: ${flight['time']} | Price: ${flight['price']}',
                  style: const TextStyle(fontSize: 16),
                ),
                trailing: const Icon(Icons.arrow_forward),
                onTap: () {
                  Navigator.pushNamed(
                    context,
                    '/flight_details',
                    arguments: flight, // Passing flight details
                  );
                },
              ),
            );
          },
        ),
      ),
    );
  }
}
