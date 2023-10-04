//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of com.bran.auth.client;

class Permission {
  /// Returns a new [Permission] instance.
  Permission({
    this.id,
    this.name,
    this.roles = const [],
    this.authority,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  List<Role> roles;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? authority;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Permission &&
    other.id == id &&
    other.name == name &&
    _deepEquality.equals(other.roles, roles) &&
    other.authority == authority;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (roles.hashCode) +
    (authority == null ? 0 : authority!.hashCode);

  @override
  String toString() => 'Permission[id=$id, name=$name, roles=$roles, authority=$authority]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
      json[r'roles'] = this.roles;
    if (this.authority != null) {
      json[r'authority'] = this.authority;
    } else {
      json[r'authority'] = null;
    }
    return json;
  }

  /// Returns a new [Permission] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Permission? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Permission[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Permission[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Permission(
        id: mapValueOfType<String>(json, r'id'),
        name: mapValueOfType<String>(json, r'name'),
        roles: Role.listFromJson(json[r'roles']),
        authority: mapValueOfType<String>(json, r'authority'),
      );
    }
    return null;
  }

  static List<Permission> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Permission>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Permission.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Permission> mapFromJson(dynamic json) {
    final map = <String, Permission>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Permission.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Permission-objects as value to a dart map
  static Map<String, List<Permission>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Permission>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Permission.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

