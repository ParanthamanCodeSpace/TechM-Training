import 'package:cloud_firestore/cloud_firestore.dart';

class DatabaseHelper {
  final CollectionReference users = FirebaseFirestore.instance.collection(
    'users',
  );

  // Register user (Store in Firestore)
  Future<bool> registerUser(
    String name,
    String dob,
    String address,
    String email,
    String password,
    String idNumber,
  ) async {
    try {
      String formattedEmail =
          email.trim().toLowerCase(); // Trim spaces & make lowercase
      print("Registering user: $formattedEmail");

      await users.doc(formattedEmail).set({
        // Set email as document ID
        'name': name,
        'dob': dob,
        'address': address,
        'email': formattedEmail,
        'password': password, // Hash in real apps
        'idNumber': idNumber,
      });

      print("User registered successfully: $formattedEmail");
      return true;
    } catch (e) {
      print("Error registering user: $e");
      return false;
    }
  }




  // Authenticate user login
  Future<bool> loginUser(String email, String password) async {
    try {
      String formattedEmail = email.toLowerCase();
      print("Attempting login for: $formattedEmail");

      // Fetch all users to debug document IDs
      QuerySnapshot snapshot = await users.get();
      List<String> storedUsers = snapshot.docs.map((doc) => doc.id).toList();
      print("Stored users in Firestore: $storedUsers");

      // Check if the email exists
      DocumentSnapshot user = await users.doc(formattedEmail).get();
      if (user.exists) {
        print("User document found in Firestore.");
        String storedPassword = user.get('password');

        if (storedPassword == password) {
          print("Login successful!");
          return true;
        } else {
          print("Incorrect password entered.");
          return false;
        }
      } else {
        print("User does not exist in Firestore.");
        return false;
      }
    } catch (e) {
      print("Error logging in: $e");
      return false;
    }
  }





  // Get user details
  Future<Map<String, dynamic>?> getUserDetails(String email) async {
    try {
      print("Fetching details for: $email");
      DocumentSnapshot user = await users.doc(email.toLowerCase()).get();

      if (user.exists) {
        print("User data found: ${user.data()}");
        return user.data() as Map<String, dynamic>;
      } else {
        print("No user data found.");
        return null;
      }
    } catch (e) {
      print("Error fetching user details: $e");
      return null;
    }
  }
}
