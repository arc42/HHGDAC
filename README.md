# ![](./hhgdac-logo.png) HHGDAC
**Hitchhikers Guide to Docu-as-Code**

Source und Infos zur JavaMagazin-Kolumne von [R.D. Müller]() und
[G.Starke](http://gernotstarke.de)

## Schmerzfreie Dokumentation
Wir möchten Dokumentation in der Softwareentwicklung von
vielerlei typischen Schmerzen befreien.


* Wir _generieren_ Dokumente, beispielsweise Architektur-,
Schnittstellen- oder Betriebsdokumentation.

* Wir arbeiten dabei DRY, modular und flexibel.

* Wir erzeugen _zielgruppenspezifische_ Ergebnisse,
u.a. in HTML, pdf, docx oder Confluence.


## How-To's

### Voraussetzungen

* [Gradle](https://gradle.org/install) installiert zu haben, hilft
ungemein... Wir bevorzugen die Installation über [sdkman](http://sdkman.io/),
den großartigen Package-Manager.
* Eine Shell/Kommandozeile/Terminal.


### Folge-1: Einführung
Wir haben einen Wrapper für Gradle zugefügt - das macht den Einstieg
für Sie noch einfacher:

    cd Folge-1
    ./gradlew asciidoctor


Falls Sie Gradle bereits installiert haben, geht's so:

    cd Folge-1
    gradle asciidoctor

Das Ergebnis, die Datei `hello.html`, wird ins Verzeichnis
`./build/asciidoc/html5` generiert.
