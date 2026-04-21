# Hayvanat Bahçesi Sistemi README

## Amaç
Bu çalışma, hayvanat bahçesindeki hayvanları nesne yönelimli programlama yaklaşımıyla modellemek için hazırlanmıştır. Sistem, farklı hayvan gruplarının ortak özelliklerini tek bir üst sınıfta toplar ve her grup için farklı çalışan davranışları polimorfizm ile yönetir.

## Kapsam
Bu sistemde:
- Hayvanlar ortak bilgilerle tanımlanır.
- Ortak bilgiler arasında tür adı, ağırlık ve yaş gibi alanlar bulunur.
- Her hayvan için ilaç dozu hesaplanabilir.
- Her hayvan için yem verme zamanı hesaplanabilir.
- Bu hesaplama mantığı hayvan grubuna göre değişir.

## Sınıflar
- `Hayvan` (soyut sınıf)
- `Atgiller`
- `Kedigiller`
- `Kemirgenler`

## Ortak Özellikler
Tüm hayvanlar için ortak kabul edilen bilgiler:
- türAdi
- agirlik
- yas

## Ortak Davranışlar
Soyut sınıf içinde tanımlanan davranışlar:
- `getDosage()`
- `getFeedSchedule()`

Bu davranışlar alt sınıflarda farklı şekilde uygulanır.

## Polimorfizm Mantığı
Polimorfizm sayesinde sistem, bir nesneyi `Hayvan` türünde görse bile gerçek nesnenin hangi alt sınıfa ait olduğuna göre doğru metodu çalıştırır.

Örneğin:
- `Atgiller` için yem verme planı farklıdır.
- `Kedigiller` için ilaç dozu farklı hesaplanır.
- `Kemirgenler` için beslenme sıklığı farklı olabilir.

## Sonuç
Bu tasarım:
- ortak alanları tekrar etmeyi önler,
- genişletilebilir bir yapı sunar,
- yeni hayvan gruplarının kolayca eklenmesini sağlar,
- polimorfizm kullanımına uygun temiz bir model oluşturur.
