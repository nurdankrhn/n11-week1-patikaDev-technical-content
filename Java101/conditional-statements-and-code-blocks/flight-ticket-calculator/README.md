# Flight Ticket Calculator

Bu program, kullanıcıdan mesafe, yaş ve yolculuk tipi bilgilerini alarak uçak bileti fiyatını hesaplar.

## Kurallar
- KM başına ücret: `0.10 TL`
- 12 yaş altı: `%50 indirim`
- 12-24 yaş arası: `%10 indirim`
- 65 yaş üstü: `%30 indirim`
- Gidiş-dönüş bileti: ek `%20 indirim` ve fiyat `2` ile çarpılır

## Geçersiz Durumlar
Aşağıdaki durumlarda program:
`Hatalı Veri Girdiniz !`
mesajını verir.

- Mesafe `0` veya negatifse
- Yaş `0` veya negatifse
- Yolculuk tipi `1` ya da `2` değilse

## Kullanılan Konular
- Java
- Scanner
- if / else if / else
- Aritmetik işlemler
- Koşul kontrolü

## Çalıştırma
```bash
javac Main.java
java Main