# Leap Year Checker

Bu program, kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eder.

## Artık Yıl Kuralları

Bir yıl:

- `400` ile tam bölünüyorsa artık yıldır.
- `100` ile tam bölünüyor ama `400` ile bölünmüyorsa artık yıl değildir.
- `100` ile tam bölünmüyorsa ve `4` ile tam bölünüyorsa artık yıldır.
- Bunların dışında artık yıl değildir.

## Örnek

- `2020` → Artık yıl
- `2021` → Artık yıl değil
- `1900` → Artık yıl değil
- `2000` → Artık yıl

## Kullanılan Konular

- Java
- Scanner
- if-else
- Mod alma işlemi (`%`)
- Temiz kod yaklaşımı
- Sorumlulukların ayrılması

## Çalıştırma
```bash
javac Main.java
java Main