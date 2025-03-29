import 'package:flutter/material.dart';
import 'package:flutter_localizations/flutter_localizations.dart';
import 'package:flutter_gen/gen_l10n/app_localizations.dart';
import 'package:firebase_core/firebase_core.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'firebase_options.dart';
import 'home_page.dart';
import 'view_card_page.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp(options: DefaultFirebaseOptions.currentPlatform);

  final prefs = await SharedPreferences.getInstance();
  final String langCode = prefs.getString('language') ?? 'en';
  final bool isLoggedIn = prefs.getBool('isLoggedIn') ?? false;
  final String userEmail = prefs.getString('userEmail') ?? '';

  runApp(MyApp(Locale(langCode), isLoggedIn, userEmail));
}

class MyApp extends StatefulWidget {
  final Locale initialLocale;
  final bool isLoggedIn;
  final String userEmail;

  const MyApp(this.initialLocale, this.isLoggedIn, this.userEmail, {super.key});

  @override
  MyAppState createState() => MyAppState();

  static MyAppState? of(BuildContext context) =>
      context.findAncestorStateOfType<MyAppState>();
}

class MyAppState extends State<MyApp> {
  late Locale _locale;
  late bool _isLoggedIn;
  late String _userEmail;

  @override
  void initState() {
    super.initState();
    _locale = widget.initialLocale;
    _isLoggedIn = widget.isLoggedIn;
    _userEmail = widget.userEmail;
  }

  void setLocale(Locale newLocale) async {
    final prefs = await SharedPreferences.getInstance();
    await prefs.setString('language', newLocale.languageCode);
    setState(() {
      _locale = newLocale;
    });
  }

  void login(String email) async {
    final prefs = await SharedPreferences.getInstance();
    await prefs.setBool('isLoggedIn', true);
    await prefs.setString('userEmail', email);
    setState(() {
      _isLoggedIn = true;
      _userEmail = email;
    });
  }

  void logout() async {
    final prefs = await SharedPreferences.getInstance();
    await prefs.setBool('isLoggedIn', false);
    await prefs.remove('userEmail');
    setState(() {
      _isLoggedIn = false;
      _userEmail = '';
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Gov ID Card Generator',
      locale: _locale,
      localizationsDelegates: const [
        AppLocalizations.delegate,
        GlobalMaterialLocalizations.delegate,
        GlobalWidgetsLocalizations.delegate,
        GlobalCupertinoLocalizations.delegate,
      ],
      supportedLocales: const [Locale('en', ''), Locale('ta', '')],
      home:
          _isLoggedIn
              ? ViewCardPage(email: _userEmail, onLogout: logout)
              : HomePage(onLogout: logout),
    );
  }
}
