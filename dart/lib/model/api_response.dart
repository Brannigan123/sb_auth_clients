//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of com.bran.auth.client;

class ApiResponse {
  /// Returns a new [ApiResponse] instance.
  ApiResponse({
    this.errored,
    this.messages = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? errored;

  List<String> messages;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ApiResponse &&
    other.errored == errored &&
    _deepEquality.equals(other.messages, messages);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errored == null ? 0 : errored!.hashCode) +
    (messages.hashCode);

  @override
  String toString() => 'ApiResponse[errored=$errored, messages=$messages]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.errored != null) {
      json[r'errored'] = this.errored;
    } else {
      json[r'errored'] = null;
    }
      json[r'messages'] = this.messages;
    return json;
  }

  /// Returns a new [ApiResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ApiResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ApiResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ApiResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ApiResponse(
        errored: mapValueOfType<bool>(json, r'errored'),
        messages: json[r'messages'] is Iterable
            ? (json[r'messages'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<ApiResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ApiResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ApiResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ApiResponse> mapFromJson(dynamic json) {
    final map = <String, ApiResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ApiResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ApiResponse-objects as value to a dart map
  static Map<String, List<ApiResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ApiResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ApiResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

