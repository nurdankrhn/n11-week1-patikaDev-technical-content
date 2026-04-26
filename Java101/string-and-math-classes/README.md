# Sayı Tahmin Oyunu

Bu programda, bilgisayar 0 ile 100 arasında bir sayı seçer ve kullanıcıdan bu sayıyı tahmin etmesini ister. Kullanıcının tahmin hakkı 5'tir. Kullanıcı her tahminde yanlış girerse, ipucu verilir ve kalan tahmin hakları gösterilir. Hatalı giriş yapıldığında ise kullanıcıya uyarı verilir.

## Oyun Kuralları:
- Bilgisayar 0 ile 100 arasında rastgele bir sayı seçer.
- Kullanıcının 5 tahmin hakkı vardır.
- Her tahminde doğru/yanlış bilgisi ve ipuçları (büyük/küçük) verilir.
- Eğer kullanıcı yanlış giriş yaparsa (0-100 dışında), uyarı mesajı verilir.
- 5 hak bitmeden doğru tahmin yapılırsa oyun biter ve "Tebrikler, doğru tahmin!" mesajı gösterilir.
- 5 hakkı bitiren ve hala doğru tahmini yapamayan kullanıcıya "Kaybettiniz!" mesajı verilir.

## Kullanılan Konular:
- Java
- `Random` sınıfı
- `Scanner` ile kullanıcı girişi
- Döngüler ve koşul yapıları

## Çalıştırma:
```bash
javac Main.java
java Main