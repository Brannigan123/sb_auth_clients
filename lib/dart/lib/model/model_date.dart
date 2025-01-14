//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of com.bran.auth.client;

class ModelDate {
  /// Returns a new [ModelDate] instance.
  ModelDate({
    this.time,
    this.year,
    this.seconds,
    this.month,
    this.date,
    this.hours,
    this.minutes,
    this.day,
    this.timezoneOffset,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? time;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? year;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? seconds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? month;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? date;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? hours;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? minutes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? day;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? timezoneOffset;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ModelDate &&
    other.time == time &&
    other.year == year &&
    other.seconds == seconds &&
    other.month == month &&
    other.date == date &&
    other.hours == hours &&
    other.minutes == minutes &&
    other.day == day &&
    other.timezoneOffset == timezoneOffset;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (time == null ? 0 : time!.hashCode) +
    (year == null ? 0 : year!.hashCode) +
    (seconds == null ? 0 : seconds!.hashCode) +
    (month == null ? 0 : month!.hashCode) +
    (date == null ? 0 : date!.hashCode) +
    (hours == null ? 0 : hours!.hashCode) +
    (minutes == null ? 0 : minutes!.hashCode) +
    (day == null ? 0 : day!.hashCode) +
    (timezoneOffset == null ? 0 : timezoneOffset!.hashCode);

  @override
  String toString() => 'ModelDate[time=$time, year=$year, seconds=$seconds, month=$month, date=$date, hours=$hours, minutes=$minutes, day=$day, timezoneOffset=$timezoneOffset]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.time != null) {
      json[r'time'] = this.time;
    } else {
      json[r'time'] = null;
    }
    if (this.year != null) {
      json[r'year'] = this.year;
    } else {
      json[r'year'] = null;
    }
    if (this.seconds != null) {
      json[r'seconds'] = this.seconds;
    } else {
      json[r'seconds'] = null;
    }
    if (this.month != null) {
      json[r'month'] = this.month;
    } else {
      json[r'month'] = null;
    }
    if (this.date != null) {
      json[r'date'] = this.date;
    } else {
      json[r'date'] = null;
    }
    if (this.hours != null) {
      json[r'hours'] = this.hours;
    } else {
      json[r'hours'] = null;
    }
    if (this.minutes != null) {
      json[r'minutes'] = this.minutes;
    } else {
      json[r'minutes'] = null;
    }
    if (this.day != null) {
      json[r'day'] = this.day;
    } else {
      json[r'day'] = null;
    }
    if (this.timezoneOffset != null) {
      json[r'timezoneOffset'] = this.timezoneOffset;
    } else {
      json[r'timezoneOffset'] = null;
    }
    return json;
  }

  /// Returns a new [ModelDate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ModelDate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ModelDate[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ModelDate[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ModelDate(
        time: mapValueOfType<int>(json, r'time'),
        year: mapValueOfType<int>(json, r'year'),
        seconds: mapValueOfType<int>(json, r'seconds'),
        month: mapValueOfType<int>(json, r'month'),
        date: mapValueOfType<int>(json, r'date'),
        hours: mapValueOfType<int>(json, r'hours'),
        minutes: mapValueOfType<int>(json, r'minutes'),
        day: mapValueOfType<int>(json, r'day'),
        timezoneOffset: mapValueOfType<int>(json, r'timezoneOffset'),
      );
    }
    return null;
  }

  static List<ModelDate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ModelDate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ModelDate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ModelDate> mapFromJson(dynamic json) {
    final map = <String, ModelDate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ModelDate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ModelDate-objects as value to a dart map
  static Map<String, List<ModelDate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ModelDate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ModelDate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

