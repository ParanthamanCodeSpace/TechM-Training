import 'package:sqflite/sqflite.dart';
import 'package:path/path.dart';

class DatabaseService {
  static Database? _database;

  // Initialize Database
  static Future<Database> _initDatabase() async {
    final path = join(await getDatabasesPath(), 'bookings.db');

    return openDatabase(
      path,
      version: 1,
      onCreate: (db, version) {
        return db.execute('''CREATE TABLE bookings (
            id INTEGER PRIMARY KEY AUTOINCREMENT, 
            name TEXT, 
            email TEXT, 
            passport TEXT, 
            flight_name TEXT, 
            flight_time TEXT, 
            flight_price TEXT
          )''');
      },
    );
  }

  static Future<Database> getDatabase() async {
    _database ??= await _initDatabase();
    return _database!;
  }

  // Insert booking
  static Future<void> insertBooking(Map<String, dynamic> booking) async {
    final db = await getDatabase();
    await db.insert('bookings', booking);
  }

  // Get all bookings
  static Future<List<Map<String, dynamic>>> getBookings() async {
    final db = await getDatabase();
    return db.query('bookings');
  }
}
