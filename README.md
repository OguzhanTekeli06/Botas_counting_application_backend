![Untitled](https://github.com/user-attachments/assets/a0ce48df-573c-4c59-9864-39e4e9931ac0)

Spring Boot Nedir?

Spring Boot, Spring Framework'ün bir üst yapısıdır ve Spring tabanlı uygulamaların geliştirilmesini hızlandırmak için tasarlanmıştır. Spring Framework, Java platformu için kapsamlı bir geliştirme çerçevesi sunar ve modüler yapısıyla çeşitli projelerde kullanılabilir. Ancak, Spring Framework'ü konfigüre etmek zaman alıcı olabilir. Spring Boot, bu konfigürasyon sürecini otomatikleştirir ve "Convention over Configuration" (yapılandırma yerine varsayılan ayarlar) prensibiyle çalışır. Spring Boot ile, minimal konfigürasyonla hızlı bir şekilde Spring tabanlı bir uygulama başlatılabilir.

Spring Boot ile Spring Framework Arasındaki Farklar:

Başlangıç Konfigürasyonu:

Spring Framework: Projeye başlarken birçok manuel konfigürasyon gerektirir. XML dosyaları ve Java sınıfları üzerinden yapılan bu konfigürasyonlar zaman alabilir.
Spring Boot: Otomatik konfigürasyon sağlar. Uygulamayı çalıştırmak için gerekli olan ayarların büyük kısmını kendisi yapar ve geliştiricilere basit bir başlangıç noktası sunar.
Starter POM'lar:

Spring Framework: İhtiyaç duyulan bağımlılıkları manuel olarak Maven veya Gradle gibi araçlarla eklemek gerekir.
Spring Boot: "Starter" POM dosyaları ile, yaygın kullanılan bağımlılıkları tek bir satırla projeye dahil edebiliriz (örneğin, spring-boot-starter-web).
Gömülü Sunucu:

Spring Framework: Uygulamayı çalıştırmak için bir uygulama sunucusu (Tomcat, Jetty vb.) ayarlamak gerekir.
Spring Boot: Tomcat, Jetty gibi sunucuları gömülü olarak getirir ve uygulamanın bağımsız bir JAR dosyası olarak çalışmasını sağlar.
Üretim Hazırlığı:

Spring Framework: Üretim ortamı için ek konfigürasyonlar yapmanız gerekebilir.
Spring Boot: Sağladığı birçok özellik sayesinde, loglama, hata yönetimi gibi üretim ortamında ihtiyaç duyulan birçok yapı taşını hazır sunar.
Spring Boot'taki Önemli Yapılar:

Controller (Denetleyici):

MVC (Model-View-Controller) yapısında, kullanıcı isteklerini işleyen ve uygun bir yanıt döndüren bileşendir. Spring Boot'ta, @RestController veya @Controller anotasyonları ile işaretlenir. @RequestMapping, @GetMapping, @PostMapping gibi anotasyonlar kullanılarak, HTTP istekleri için metotlar tanımlanır.
Entity (Varlık):

Veritabanındaki tablolarla ilişkilendirilmiş Java sınıflarıdır. Spring Data JPA kullanılarak veritabanı işlemleri yapılır. @Entity anotasyonu ile işaretlenir. Sınıftaki her bir alan, bir veritabanı sütununu temsil eder. Örneğin, @Id, @Column gibi anotasyonlar kullanılır.
Repository (Depo):

Veritabanı işlemlerini gerçekleştiren bileşendir. Spring Data JPA kullanarak CrudRepository, JpaRepository veya PagingAndSortingRepository arayüzlerinden türetilen arayüzlerle veri erişim işlemleri yapılır. Bu arayüzler, CRUD (Create, Read, Update, Delete) işlemlerini otomatik olarak sağlar.
Service (Hizmet):

İş mantığını barındıran bileşendir. Veritabanı erişimi (Repository) ve denetleyici (Controller) arasındaki iş mantığını buraya yerleştirilir. @Service anotasyonu ile işaretlenir. Uygulama mantığını burada yalıtarak, kontrol ve test edilebilirlik sağlar.
Bu bileşenler, Spring Boot uygulamalarında tipik olarak belirli klasör yapıları altında organize edilir. Örneğin:

src/main/java/com/yourpackage/controller — Denetleyiciler
src/main/java/com/yourpackage/entity — Varlıklar
src/main/java/com/yourpackage/repository — Depo sınıfları
src/main/java/com/yourpackage/service — Hizmet sınıfları
Bu yapı, kodun daha düzenli ve anlaşılır olmasını sağlar ve Spring Boot'un otomatik tarama mekanizmaları ile uyumlu çalışır.
