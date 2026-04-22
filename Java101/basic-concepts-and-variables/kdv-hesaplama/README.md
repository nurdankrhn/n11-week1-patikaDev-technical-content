# KDV Tutarı Hesaplayan Program

Bu program, kullanıcıdan bir ürün tutarı alır ve girilen değere göre KDV oranını belirleyip:

- KDV'siz fiyatı
- KDV oranını
- KDV tutarını
- KDV'li fiyatı

ekrana yazdırır.

## KDV Kuralları
- Tutar **0 ile 1000 TL** arasındaysa KDV oranı **%18**
- Tutar **1000 TL'den büyükse** KDV oranı **%8**

## Kullanılan Konular
- Java
- Scanner ile kullanıcıdan veri alma
- Koşullu ifade
- Ternary Operator
- Aritmetik işlemler

## Çalıştırma
```bash
javac src/Main.java
java -cp src Main