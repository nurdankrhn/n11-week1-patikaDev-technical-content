# Online Film Satış ve Kiralama Sistemi

## Amaç
Bu çalışma, online film satan veya kiralayan bir uygulamanın temel yapısını nesne yönelimli olarak modelleyen UML sınıf diyagramını sunar.

## Kapsam
Sistem aşağıdaki işlevleri kapsar:

- Filmler listelenebilir.
- Filmler sıralanabilir.
- Kullanıcılar uygulamaya abone olabilir.
- Kullanıcılar abonelik için sistem üzerinden kredi satın alabilir.
- Sadece abone kullanıcılar, sahip oldukları krediler ile film kiralayabilir.
- Film kiralandığında, filmin kredi bedeli kadar kullanıcının hesabından kredi düşülür.
- Normal kullanıcılar ve aboneler film satın alabilir.
- Eğer bir film sistemde mevcut değilse kullanıcı tarafından talep edilebilir.

## Sınıflar
- `Kullanici`
- `AboneKullanici`
- `Film`
- `Abonelik`
- `KrediHesabi`
- `Kiralama`
- `SatinAlma`
- `FilmTalebi`
- `FilmUygulamasi`

## Temel İlişkiler
- `FilmUygulamasi`, filmleri ve kullanıcıları yönetir.
- `Kullanici`, film satın alabilir.
- `AboneKullanici`, `Kullanici` sınıfından türetilir.
- `AboneKullanici`, bir `KrediHesabi` üzerinden kredi satın alır ve film kiralar.
- `Kiralama`, bir abone kullanıcı ve bir film arasında gerçekleşir.
- `SatinAlma`, hem normal kullanıcı hem de abone kullanıcı tarafından yapılabilir.
- `Film` sistemde mevcut değilse `FilmTalebi` oluşturulabilir.
- `Abonelik`, kullanıcının sisteme abone olma durumunu temsil eder.

## Not
Sınıf diyagramında nitelikler ve metodlar detaylı verilmemiş, yapı ve ilişkiler ön planda tutulmuştur.
