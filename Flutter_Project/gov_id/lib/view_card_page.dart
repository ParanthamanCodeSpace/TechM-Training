import 'package:flutter/material.dart';
import 'package:qr_flutter/qr_flutter.dart';
import 'package:gov_id/database_helper.dart';
import 'home_page.dart';

class ViewCardPage extends StatefulWidget {
  final String email;
  final VoidCallback onLogout;

  const ViewCardPage({super.key, required this.email, required this.onLogout});

  @override
  _ViewCardPageState createState() => _ViewCardPageState();
}

class _ViewCardPageState extends State<ViewCardPage> {
  final DatabaseHelper _dbHelper = DatabaseHelper();
  Map<String, dynamic>? _userData;
  bool _isLoading = true;

  @override
  void initState() {
    super.initState();
    _fetchUserData();
    // ❌ Removed _confirmLogout() from here
  }

  @override
  void didChangeDependencies() {
    super.didChangeDependencies();
    // ✅ This ensures it runs after context is available
  }

  void _fetchUserData() async {
    print("Fetching user data for: ${widget.email}");

    Map<String, dynamic>? userData = await _dbHelper.getUserDetails(
      widget.email,
    );

    if (mounted) {
      setState(() {
        _userData = userData;
        _isLoading = false;
      });
    }

    print("Fetched user data: $_userData");
  }

  void _confirmLogout() {
    showDialog(
      context: context,
      builder: (BuildContext context) {
        return AlertDialog(
          title: const Text("CONFIRM LOGOUT"),
          content: const Text("Are you sure, you want to log out?"),
          actions: [
            TextButton(
              onPressed: () {
                Navigator.of(context).pop(); // Close the dialog
              },
              child: const Text("Cancel"),
            ),
            TextButton(
              onPressed: () {
                Navigator.of(context).pop(); // Close dialog
                _logout(); // Call logout function
              },
              child: const Text("Logout", style: TextStyle(color: Colors.red)),
            ),
          ],
        );
      },
    );
  }

  void _logout() {
    print("Logging out...");
    widget.onLogout();

    Navigator.pushAndRemoveUntil(
      context,
      MaterialPageRoute(
        builder: (context) => HomePage(onLogout: widget.onLogout),
      ),
      (Route<dynamic> route) => false,
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Your Unique ID Card"),
        actions: [
          IconButton(icon: const Icon(Icons.logout), onPressed: _confirmLogout),
        ],
      ),
      
      body:
          _isLoading
              ? const Center(child: CircularProgressIndicator())
              : _userData == null
              ? const Center(child: Text("User data not found."))
              : Center(
                child: Card(
                  elevation: 6,
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(12),
                  ),
                  child: Container(
                    width: 350,
                    height: 220,
                    decoration: BoxDecoration(
                      borderRadius: BorderRadius.circular(12),
                      border: Border.all(color: Colors.black, width: 1),
                      gradient: const LinearGradient(
                        colors: [
                          Color.fromARGB(0, 27, 21, 15), // Saffron
                          Colors.white,
                          Color.fromARGB(228, 149, 152, 149), // Green
                        ],
                        stops: [0.2, 0.5, 0.8],
                        begin: Alignment.topLeft,
                        end: Alignment.bottomRight,
                      ),
                    ),
                    child: Padding(
                      padding: const EdgeInsets.all(12),
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                        children: [
                          // User Info Column
                          Expanded(
                            flex: 3,
                            child: Column(
                              crossAxisAlignment: CrossAxisAlignment.start,
                              mainAxisAlignment: MainAxisAlignment.center,
                              children: [
                                const Text(
                                  "Government of India",
                                  style: TextStyle(
                                    fontSize: 16,
                                    fontWeight: FontWeight.bold,
                                    color: Colors.black87,
                                  ),
                                ),
                                const SizedBox(height: 5),
                                _buildInfoRow("Name", _userData!['name']),
                                _buildInfoRow("DOB", _userData!['dob']),
                                _buildInfoRow("Address", _userData!['address']),
                                //_buildInfoRow("Email", _userData!['email']),
                                _buildInfoRow(
                                  "Unique ID ",
                                  "IND-${_userData!['idNumber']}",
                                  bold: true,
                                ),
                              ],
                            ),
                          ),

                          // QR Code Column
                          Expanded(
                            flex: 2,
                            child: Column(
                              mainAxisAlignment: MainAxisAlignment.center,
                              children: [
                                QrImageView(
                                  data:
                                      "${_userData!['name']},${_userData!['idNumber']},${_userData!['email']}",
                                  version: QrVersions.auto,
                                  size: 70,
                                ),
                                const SizedBox(height: 5),
                                const Text(
                                  "Scan for Details",
                                  style: TextStyle(fontSize: 10),
                                ),
                              ],
                            ),
                          ),
                        ],
                      ),
                    ),
                  ),
                ),
              ),
    );
  }

  // Helper method to create rows for displaying user data
  Widget _buildInfoRow(String label, String value, {bool bold = false}) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 2),
      child: Row(
        children: [
          Text(
            "$label: ",
            style: TextStyle(
              fontWeight: FontWeight.bold,
              fontSize: bold ? 14 : 12,
            ),
          ),
          Expanded(
            child: Text(
              value,
              overflow: TextOverflow.ellipsis,
              style: TextStyle(fontSize: 12),
            ),
          ),
        ],
      ),
    );
  }
}
