# Asansör Simülasyon Sistemi

## Amaç
Bu çalışma, 12 katlı bir ofis binasındaki asansör sistemini nesne yönelimli programlama ilkeleriyle modelleyen bir UML sınıf diyagramı sunar.

## Kullanılan OOP İlkeleri

### Encapsulation
Her sınıf kendi sorumluluğuna ait verileri ve davranışları kapsar.  
Örneğin:
- `Asansor`, kendi durumunu, yönünü, kapasitesini ve kapılarını yönetir.
- `Yolcu`, kalkış ve varış bilgilerini saklar.
- `Saat`, zaman bilgisini kontrol eder.
- `GunlukKaydi`, olay kayıtlarını tutar.

### Inheritance
Ortak yapıların soyutlama ile üst sınıfta toplanması amaçlanmıştır.  
Örneğin:
- `Buton`, `CagriButonu`, `HedefButonu`, `KapiAcButonu`, `KapiKapaButonu`, `AcilDurumButonu` için temel sınıftır.
- `Gosterge`, `KatGostergesi` ve `SinyalIsigi` için temel soyut yapıdır.

### Polymorphism
Aynı üst sınıftan türeyen nesneler farklı davranış sergileyebilir.
- Farklı `Buton` türleri farklı tetikleme davranışına sahiptir.
- Farklı `Gosterge` türleri farklı bilgileri gösterir.

### Abstraction
Sistemde ortak ama soyut kavramlar ayrı sınıflarla ifade edilmiştir.
- `Buton`
- `Gosterge`
- `Programlayici`

## Kapsam
Sistem aşağıdaki yapıları içerir:

- Bina 12 katlıdır.
- Binada 5 adet asansör vardır.
- Her asansör 12 kata çıkabilir.
- Her asansörün kapasitesi yaklaşık 6 yetişkindir.
- Her asansör yalnızca gerektiğinde hareket eder.
- Her asansörün kapısı, kat gösterge ışığı ve kontrol paneli vardır.
- Kontrol panelinde hedef düğmeleri, kapı açma, kapı kapama ve acil durum düğmesi vardır.
- Her katta kapılar, varış zili, sinyal ışıkları ve çağrı düğmeleri bulunur.
- Yolcular yukarı/aşağı çağrı düğmeleri ile asansör çağırır.
- Programlayıcı uygun asansörü görevlendirir.
- Yolcular asansör içinde hedef kat seçer.
- Saat, simülasyondaki zamanı yönetir.
- Günlük sistemi olayları zaman damgası ile kaydeder.
- Rastgele sayı üreteci yolcu üretmek ve kat bilgisi belirlemek için kullanılır.

## Sınıflar
- `Bina`
- `Kat`
- `Asansor`
- `KontrolPaneli`
- `Yolcu`
- `Programlayici`
- `Saat`
- `Gunluk`
- `GunlukKaydi`
- `RastgeleSayiUretici`
- `Kapi`
- `Buton` *(soyut)*
- `CagriButonu`
- `HedefButonu`
- `KapiAcButonu`
- `KapiKapaButonu`
- `AcilDurumButonu`
- `Gosterge` *(soyut)*
- `KatGostergesi`
- `SinyalIsigi`
- `VarisZili`

## Temel İlişkiler
- `Bina`, birden fazla `Kat` ve `Asansor` içerir.
- Her `Kat`, çağrı düğmeleri, kapılar, sinyal ışıkları ve varış zili içerir.
- Her `Asansor`, bir `KontrolPaneli`, kapı ve göstergelere sahiptir.
- `KontrolPaneli`, farklı tipte butonlar içerir.
- `Programlayici`, çağrılara göre uygun `Asansor` seçer.
- `Yolcu`, çağrı düğmesine basar ve asansörde hedef kat seçer.
- `Saat`, simülasyon zamanını üretir.
- `Gunluk`, olayları `GunlukKaydi` nesneleri ile saklar.
- `RastgeleSayiUretici`, yolcu ve kat seçimlerini üretir.

## Not
Bu diyagramda sınıfların tüm nitelik ve metodları detaylandırılmamış, odak sınıflar arası yapısal ilişkiler ve OOP ilkelerinin uygulanması olmuştur.
