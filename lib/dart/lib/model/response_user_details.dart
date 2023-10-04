//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of com.bran.auth.client;

class ResponseUserDetails {
  /// Returns a new [ResponseUserDetails] instance.
  ResponseUserDetails({
    this.userId,
    this.username,
    this.displayName,
    this.email,
    this.roles = const [],
    this.emailVerified,
    this.lockedAccount,
    this.deletedAccount,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? userId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? username;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? displayName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? email;

  List<Role> roles;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? emailVerified;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? lockedAccount;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? deletedAccount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ResponseUserDetails &&
    other.userId == userId &&
    other.username == username &&
    other.displayName == displayName &&
    other.email == email &&
    _deepEquality.equals(other.roles, roles) &&
    other.emailVerified == emailVerified &&
    other.lockedAccount == lockedAccount &&
    other.deletedAccount == deletedAccount;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (userId == null ? 0 : userId!.hashCode) +
    (username == null ? 0 : username!.hashCode) +
    (displayName == null ? 0 : displayName!.hashCode) +
    (email == null ? 0 : email!.hashCode) +
    (roles.hashCode) +
    (emailVerified == null ? 0 : emailVerified!.hashCode) +
    (lockedAccount == null ? 0 : lockedAccount!.hashCode) +
    (deletedAccount == null ? 0 : deletedAccount!.hashCode);

  @override
  String toString() => 'ResponseUserDetails[userId=$userId, username=$username, displayName=$displayName, email=$email, roles=$roles, emailVerified=$emailVerified, lockedAccount=$lockedAccount, deletedAccount=$deletedAccount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.userId != null) {
      json[r'userId'] = this.userId;
    } else {
      json[r'userId'] = null;
    }
    if (this.username != null) {
      json[r'username'] = this.username;
    } else {
      json[r'username'] = null;
    }
    if (this.displayName != null) {
      json[r'displayName'] = this.displayName;
    } else {
      json[r'displayName'] = null;
    }
    if (this.email != null) {
      json[r'email'] = this.email;
    } else {
      json[r'email'] = null;
    }
      json[r'roles'] = this.roles;
    if (this.emailVerified != null) {
      json[r'emailVerified'] = this.emailVerified;
    } else {
      json[r'emailVerified'] = null;
    }
    if (this.lockedAccount != null) {
      json[r'lockedAccount'] = this.lockedAccount;
    } else {
      json[r'lockedAccount'] = null;
    }
    if (this.deletedAccount != null) {
      json[r'deletedAccount'] = this.deletedAccount;
    } else {
      json[r'deletedAccount'] = null;
    }
    return json;
  }

  /// Returns a new [ResponseUserDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ResponseUserDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ResponseUserDetails[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ResponseUserDetails[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ResponseUserDetails(
        userId: mapValueOfType<String>(json, r'userId'),
        username: mapValueOfType<String>(json, r'username'),
        displayName: mapValueOfType<String>(json, r'displayName'),
        email: mapValueOfType<String>(json, r'email'),
        roles: Role.listFromJson(json[r'roles']),
        emailVerified: mapValueOfType<bool>(json, r'emailVerified'),
        lockedAccount: mapValueOfType<bool>(json, r'lockedAccount'),
        deletedAccount: mapValueOfType<bool>(json, r'deletedAccount'),
      );
    }
    return null;
  }

  static List<ResponseUserDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ResponseUserDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ResponseUserDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ResponseUserDetails> mapFromJson(dynamic json) {
    final map = <String, ResponseUserDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ResponseUserDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ResponseUserDetails-objects as value to a dart map
  static Map<String, List<ResponseUserDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ResponseUserDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ResponseUserDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

