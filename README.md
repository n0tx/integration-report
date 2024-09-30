# Aplikasi Integrasi Laporan Klaim

![image](https://github.com/user-attachments/assets/a24718fc-82e4-4f5d-8984-0b872e388423)

- Java 17
- Spring Boot
- Rest API
- Spring Data JPA
- Lombok
- Validation
- H2DB
- JUnit Test
- Logger

Aplikasi Integrasi Laporan Klaim adalah aplikasi penampunngan data berbasis Rest Api

Aplikasi Integrasi Laporan Klaim menerima data yang dikirim oleh Aplikasi Laporan Klaim

## Bagaimana menjalankan aplikasi
- Git clone
```
$git clone https://github.com/n0tx/integration-report.git
```
- Run Spring Boot
```
$cd integration-report
$pwd
/integration-report
$./mvnw spring-boot:run
```
### Integrasi Laporan Klaim API Endpoint

- Daftar Klaim \
GET http://localhost:8081/api/claims

- Buat Klaim Baru \
POST http://localhost:8081/api/claims
```
{
    "lob": "KUR",
    "penyebabKlaim": "Macet",
    "periode": "2023-01-31",
    "nilaiBebanKlaim": "10"
}
```

![image](https://github.com/user-attachments/assets/5a6b57f5-1fc6-4fae-8fd3-c0d50fba01fb)

