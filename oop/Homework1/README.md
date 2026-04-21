# Üniversite Yapısı

## Amaç
Bu proje, verilen kurallara göre üniversite yapısını nesne yönelimli yaklaşımla modelleyen bir UML sınıf diyagramını tanımlar.

## Senaryo
Sistem aşağıdaki kurallara göre modellenmiştir:

1. Üniversiteye ait sınıflıklar, çalışma ofisleri ve departmanlar vardır.
2. Departmanlara ait ofisler vardır.
3. Üniversiteye ait çalışanlar vardır. Bu çalışanlar profesör veya memur olabilir.
4. Her çalışan bir ofiste çalışır.

## Sınıflar
Bu modelde yer alan sınıflar şunlardır:

- `Universite`
- `Departman`
- `Ofis`
- `Siniflik`
- `Calisan` *(soyut sınıf)*
- `Profesor`
- `Memur`

## İlişkiler

- Bir `Universite`, bir veya birden fazla `Departman` içerir.
- Bir `Universite`, bir veya birden fazla `Siniflik` içerir.
- Bir `Universite`, bir veya birden fazla `Calisan` içerir.
- Bir `Departman`, bir veya birden fazla `Ofis` içerir.
- Her `Calisan`, tam olarak bir `Ofis` içinde çalışır.
- `Profesor` ve `Memur`, `Calisan` sınıfından kalıtım alır.

## Not
Bu ödevde sınıflara ait niteliklerin (attribute) ve davranışların (method) belirtilmesi istenmediği için diyagramda yalnızca sınıf isimleri ve sınıflar arası ilişkiler gösterilmiştir.

## UML Diyagramı
UML diyagramı ayrı dosyada verilmiştir:

- `uml-diagram.md`

