# Uçuş ve Pilot Yönetim Sistemi

## Amaç
Bu çalışma, uçuşların, hava yolu şirketlerinin, uçakların, havaalanlarının ve pilotların yönetimini nesne yönelimli olarak modelleyen bir UML sınıf diyagramı sunar.

## Kapsam
Sistem aşağıdaki varlıkları ve ilişkileri içerir:

- Hava yolu şirketleri uçuşları gerçekleştirir.
- Her hava yolu şirketinin benzersiz bir kimliği vardır.
- Hava yolu şirketleri farklı tipte uçaklara sahiptir.
- Uçaklar çalışma durumunda veya onarım durumunda olabilir.
- Her uçuşun benzersiz bir kimliği vardır.
- Her uçuşun kalkış havaalanı ve varış havaalanı bulunur.
- Her uçuşun kalkış ve iniş saatleri vardır.
- Her uçuşta bir pilot ve bir yardımcı pilot bulunur.
- Havaalanlarının benzersiz kimliği ve adı vardır.
- Hava yolu şirketlerinin pilotları vardır.
- Her pilotun bir deneyim seviyesi vardır.
- Bir uçak tipi, belirli sayıda pilota ihtiyaç duyabilir.

## Sınıflar
- `HavaYoluSirketi`
- `Ucak`
- `UcakTipi`
- `Ucus`
- `Havaalani`
- `Pilot`

## Temel İlişkiler
- Bir `HavaYoluSirketi`, birden fazla `Ucak` ve `Pilot` barındırabilir.
- Bir `HavaYoluSirketi`, birden fazla `Ucus` gerçekleştirir.
- Her `Ucak`, bir `UcakTipi` ile ilişkilidir.
- Her `Ucus`, bir `Ucak` ile gerçekleştirilir.
- Her `Ucus`, bir kalkış ve bir varış `Havaalani` bilgisine sahiptir.
- Her `Ucus` için bir `Pilot` ve bir `YardimciPilot` görevlendirilir.
- `Pilot`, bağlı olduğu hava yolu şirketesinde görev yapar.
- `UcakTipi`, ihtiyaç duyduğu pilot sayısını belirtir.

## Not
Sınıflara ait nitelik ve davranışlar detaylı gösterilmemiştir; diyagram yapısal ilişkilere odaklanır.
