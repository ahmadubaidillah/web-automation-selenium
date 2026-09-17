@login
Feature: Login SauceDemo

  Background:
    Given user membuka halaman login SauceDemo

  @TC-01 @smoke @positive
  Scenario: Login berhasil dengan kredensial valid
    When user login dengan username "standard_user" dan password "secret_sauce"
    Then user diarahkan ke halaman produk
    And judul halaman menampilkan "Products"

  @TC-02 @negative
  Scenario: Gagal login dengan password salah
    When user login dengan username "invalid_username" dan password "wrong_password"
    Then muncul pesan error "Username and password do not match any user in this service"

  @TC-03 @negative
  Scenario: Gagal login dengan akun locked_out_user
    When user login dengan username "locked_out_user" dan password "secret_sauce"
    Then muncul pesan error "Sorry, this user has been locked out."

  @TC-04 @negative
  Scenario: Gagal login jika username kosong
    When user login dengan username "" dan password "secret_sauce"
    Then muncul pesan error "Username is required"

  @TC-05 @negative
  Scenario: Gagal login jika password kosong
    When user login dengan username "standard_user" dan password ""
    Then muncul pesan error "Password is required"

  @TC-06 @positive
  Scenario: Logout setelah berhasil login
    When user login dengan username "standard_user" dan password "secret_sauce"
    And user melakukan logout
    Then user diarahkan kembali ke halaman login