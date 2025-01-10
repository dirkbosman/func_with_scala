# Overview

### The system should have the following specifications:
- A scientist experiments with several reactions every day and records the temperatures of his solution per hour for 2 weeks. Some of these temperatures were badly recorded, they will have to be transformed. Our goal will be to find the day with the most measurements and calculate the average.

---

#### **Purpose:**
The program should processes hourly measures for a week (or any given period) by:
1. Breaking them into daily segments.
2. Cleaning and filtering the data.
3. Identifying the "best" day based on a filtering criteria.
4. Computing the average of measures for the "best" day.

#### **Key Points:**

- **Attributes**:
  - `measure_per_hour`: A sequence of integers representing hourly measurements.
  - `measures_per_day`: A sequence of sequences, where each inner sequence represents a day's worth of hourly measurements.

- **Methods**:
  1. **`get_measures_per_day`**:
     - Splits the hourly data into daily segments.
     - Takes a sequence of hourly measures as input.
     - Returns a sequence of sequences, with each inner sequence containing 24 hourly measurements.

  2. **`print_measures_per_day`**:
     - Prints daily measurements, formatted as sequences of integers separated by semicolons.

  3. **`negative_to_positive`**:
     - Converts negative integers to positive integers.
     - Returns the absolute value of a given integer.

  4. **`filter_measure`**:
     - A filtering function to check whether a measure is between 15 and 25.
     - Returns `true` if the condition is met, otherwise `false`.

  5. **`max_measures`**:
     - Compares two sequences of measures and returns the longer one.
     - This is used during the reduction of daily filtered sequences to find the "best" day.

  6. **`main`**:
     - The main program logic:
       - Generates random hourly measures for a week (336 hours).
       - Splits the measures into daily sequences.
       - Cleans the data (removes negatives by converting them to positives).
       - Filters the data to keep only measures between 15 and 25.
       - Identifies the "best day" as the one with the most filtered measures.
       - Computes and prints the average of measures for the "best day."
