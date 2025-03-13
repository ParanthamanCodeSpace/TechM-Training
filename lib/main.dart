import 'package:flutter/material.dart';
import 'screens/search_screen.dart';
import 'screens/available_flights_screen.dart';
import 'screens/flight_details_screen.dart';
import 'screens/booking_screen.dart';
import 'screens/my_bookings_screen.dart';
import 'screens/home_screen.dart';
void main() {
  runApp(const FlightPlanApp());
}

class FlightPlanApp extends StatelessWidget {
  const FlightPlanApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flight Plan',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      initialRoute: '/',
      routes: {
        '/': (context) => const HomeScreen(),
        '/search': (context) => const SearchScreen(),
        '/available_flights': (context) => const AvailableFlightsScreen(),
        '/flight_details': (context) => const FlightDetailsScreen(),
        '/booking': (context) => const BookingScreen(),
        '/my_bookings': (context) => const MyBookingsScreen(),
      },
    );
  }
}
