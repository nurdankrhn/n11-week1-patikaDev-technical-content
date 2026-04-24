# Activity Recommender

Bu program, kullanıcıdan sıcaklık değerini alır ve uygun etkinliği önerir.

## Koşullar
- Sıcaklık 5'ten küçükse: Kayak
- Sıcaklık 5 ile 15 arasındaysa: Sinema
- Sıcaklık 15 ile 25 arasındaysa: Piknik
- Sıcaklık 25'ten büyükse: Yüzme

## Kullanılan Konular
- Java
- Scanner
- if / else if / else

## Alternatif Çözüm Mantığı
Bu soru farklı şekillerde de çözülebilir:
- iç içe `if` kullanarak
- sadece sıralı `if` bloklarıyla
- önce küçük aralıkları, sonra büyük aralıkları kontrol ederek

Bu örnekte en sade kullanım olan `if - else if - else` yapısı tercih edilmiştir.

## Çalıştırma
```bash
javac Main.java
java Main