import 'package:flutter/material.dart';
import 'package:flight_plan_flutter/services/database_service.dart';

class MyBookingsScreen extends StatefulWidget {
  const MyBookingsScreen({super.key});

  @override
  _MyBookingsScreenState createState() => _MyBookingsScreenState();
}

class _MyBookingsScreenState extends State<MyBookingsScreen> {
  List<Map<String, dynamic>> _bookings = [];

  @override
  void initState() {
    super.initState();
    _loadBookings();
  }

  // Fetch all bookings from database
  Future<void> _loadBookings() async {
    final bookings = await DatabaseService.getBookings();
    setState(() {
      _bookings = bookings;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('My Bookings')),
      body:
          _bookings.isEmpty
              ? const Center(child: Text('No bookings found.'))
              : ListView.builder(
                itemCount: _bookings.length,
                itemBuilder: (context, index) {
                  final booking = _bookings[index];

                  return Card(
                    margin: const EdgeInsets.all(10),
                    elevation: 4,
                    shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(10),
                    ),
                    child: ListTile(
                      contentPadding: const EdgeInsets.all(15),
                      title: Text(
                        booking['name'],
                        style: const TextStyle(
                          fontSize: 18,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                      subtitle: Text(
                        'Flight: ${booking['flight_name']}\n'
                        'Departure: ${booking['flight_time']}\n'
                        'Price: ${booking['flight_price']}',
                        style: const TextStyle(fontSize: 16),
                      ),
                      leading: const Icon(
                        Icons.flight_takeoff,
                        color: Colors.blue,
                      ),
                    ),
                  );
                },
              ),
    );
  }
}
