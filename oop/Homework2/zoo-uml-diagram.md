# Hayvanat Bahçesi UML Sınıf Diyagramı

Aşağıdaki diyagram, polimorfizm kullanılarak tasarlanan hayvanat bahçesi sistemini göstermektedir.

```mermaid
classDiagram
    class Hayvan {
        <<abstract>>
        turAdi
        agirlik
        yas
        getDosage()
        getFeedSchedule()
    }

    class Atgiller {
        getDosage()
        getFeedSchedule()
    }

    class Kedigiller {
        getDosage()
        getFeedSchedule()
    }

    class Kemirgenler {
        getDosage()
        getFeedSchedule()
    }

    Hayvan <|-- Atgiller
    Hayvan <|-- Kedigiller
    Hayvan <|-- Kemirgenler
```

## Açıklama
- `Hayvan` soyut sınıftır.
- Tüm hayvan grupları ortak özellikleri `Hayvan` sınıfından alır.
- `getDosage()` ve `getFeedSchedule()` metotları her alt sınıfta farklı şekilde uygulanır.
- Böylece polimorfizm sağlanmış olur.
