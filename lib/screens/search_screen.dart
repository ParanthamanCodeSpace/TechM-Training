import 'package:flutter/material.dart';

class SearchScreen extends StatefulWidget {
  const SearchScreen({super.key});

  @override
  _SearchScreenState createState() => _SearchScreenState();
}

class _SearchScreenState extends State<SearchScreen> {
  final List<String> locations = [
    'New York',
    'London',
    'Tokyo',
    'Paris',
    'Dubai',
  ];
  String? fromLocation;
  String? toLocation;
  DateTime? selectedDate;

  // Function to show Date Picker
  Future<void> _pickDate(BuildContext context) async {
    final DateTime? picked = await showDatePicker(
      context: context,
      initialDate: DateTime.now(),
      firstDate: DateTime.now(),
      lastDate: DateTime(2030),
    );
    if (picked != null && picked != selectedDate) {
      setState(() {
        selectedDate = picked;
      });
    }
  }

  // Function to handle Search
  void _searchFlights() {
    if (fromLocation != null && toLocation != null && selectedDate != null) {
      Navigator.pushNamed(
        context,
        '/available_flights',
        arguments: {
          'from': fromLocation,
          'to': toLocation,
          'date': selectedDate.toString(),
        },
      );
    } else {
      ScaffoldMessenger.of(context).showSnackBar(
        const SnackBar(content: Text('Please select all fields!')),
      );
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Search Flights')),
      body: Padding(
        padding: const EdgeInsets.all(20.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            // "From" Dropdown
            DropdownButtonFormField<String>(
              decoration: const InputDecoration(labelText: 'From'),
              items:
                  locations.map((String location) {
                    return DropdownMenuItem<String>(
                      value: location,
                      child: Text(location),
                    );
                  }).toList(),
              onChanged: (value) => setState(() => fromLocation = value),
            ),
            const SizedBox(height: 20),

            // "To" Dropdown
            DropdownButtonFormField<String>(
              decoration: const InputDecoration(labelText: 'To'),
              items:
                  locations.map((String location) {
                    return DropdownMenuItem<String>(
                      value: location,
                      child: Text(location),
                    );
                  }).toList(),
              onChanged: (value) => setState(() => toLocation = value),
            ),
            const SizedBox(height: 20),

            // Date Picker
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                Text(
                  selectedDate == null
                      ? 'Select Date'
                      : 'Date: ${selectedDate!.toLocal()}'.split(' ')[0],
                  style: const TextStyle(fontSize: 16),
                ),
                IconButton(
                  icon: const Icon(Icons.calendar_today),
                  onPressed: () => _pickDate(context),
                ),
              ],
            ),
            const SizedBox(height: 40),

            // Search Button
            ElevatedButton.icon(
              onPressed: _searchFlights,
              icon: const Icon(Icons.search),
              label: const Text('Find Flights'),
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
    );
  }
}
