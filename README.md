# SauceDemo UI Test Automation — Selenium + Cucumber (BDD) + JUnit

Portofolio UI test automation untuk web demo [SauceDemo](https://www.saucedemo.com/) menggunakan **Selenium WebDriver**, **Cucumber** (BDD framework), dan **JUnit** sebagai test runner, disusun dengan pola **Page Object Model (POM)**.

Project ini adalah versi Java dari selenium automation, untuk mendemonstrasikan kemampuan automation testing di Java/Selenium dan pendekatan BDD (Behavior Driven Development).

## 🎯 Tujuan

- Mendemonstrasikan penulisan automation test menggunakan Selenium WebDriver + Java.
- Mendemonstrasikan pendekatan BDD dengan Cucumber (Gherkin syntax) agar test case bisa dibaca oleh non-technical stakeholder.
- Menerapkan Page Object Model agar kode reusable dan maintainable.

## 🛠️ Tech Stack

| Komponen           | Tools                                                                              |
| ------------------ | ---------------------------------------------------------------------------------- |
| Bahasa             | Java 11                                                                            |
| Browser Automation | Selenium WebDriver 4                                                               |
| BDD Framework      | Cucumber 7                                                                         |
| Test Runner        | JUnit 4                                                                            |
| Driver Management  | WebDriverManager (Bonigarcia) — otomatis download driver, tidak perlu setup manual |
| Build Tool         | Maven                                                                              |

## 🚀 Cara Menjalankan

### Prasyarat

- Java JDK 11 atau lebih baru
- Maven 3.6+
- Google Chrome (driver otomatis di-download oleh WebDriverManager, tidak perlu setup manual)

### 1. Install dependencies

```bash
mvn clean install -DskipTests
```

### 2. Jalankan semua test

```bash
mvn test
```

### 3. Jalankan test berdasarkan tag tertentu

```bash
# Hanya jalankan scenario login
mvn test -Dcucumber.filter.tags="@login"

# Hanya jalankan smoke test
mvn test -Dcucumber.filter.tags="@smoke"

# Kombinasi tag
mvn test -Dcucumber.filter.tags="@positive and not @smoke"

```

## 📊 Test Report

Setelah eksekusi, laporan tersedia di:

- HTML report : `target/cucumber-reports/cucumber-report.html`

---

Dibuat sebagai bagian dari portofolio belajar QA Automation — versi Java (Selenium + Cucumber + JUnit)

---

## 👤 Author

**Ahmad Ubaidillah Asshidiqi**
Junior QA Engineer

- LinkedIn: [LinkedIn](https://id.linkedin.com/in/ahmad-ubaidillah-asshidiqi)
- GitHub: [Github](https://github.com/ahmadubaidillah)


