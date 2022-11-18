package Datum;

import java.time.LocalDate;

public class Datum {

    public final static int FORMAT_SHORT = 0;
    public final static int FORMAT_NORMAL = 1;
    public final static int FORMAT_LONG = 2;
    public final static int FORMAT_US = 3;

    private int tag = 0;
    private int monat = 0;
    private int jahr = 0;

    /**
     * Erzeugt eine Datumsinstanz mit dem aktuellen Systemdatum.
     */
    public Datum() {
        LocalDate today = LocalDate.now();
        tag = today.getDayOfMonth();
        monat = today.getMonthValue();
        jahr = today.getYear();
    }

    /**
     * Erzeugt eine Datumsinstanz im Format TT.MM.YYYY.
     *
     * @param dateString zu parsender String
     */
    public Datum(String dateString) {
        String[] splitDatum = dateString.split("\\.");
        tag = Integer.parseInt(splitDatum[0]);
        monat = Integer.parseInt(splitDatum[1]);
        jahr = Integer.parseInt(splitDatum[2]);
    }

    /**
     * Erzeugt eine Datumsinstanz, die t Tage nach dem 1.1.1900 liegt.
     *
     * @param tage die Tage seit dem 1.1.1900; muss >= 0 sein
     */
    public Datum(int tage) {
        if (tage < 0) {
            throw new IllegalArgumentException("Tage kleiner oder gleich 0!");
        }
        addiereTage(tage);
    }

    /**
     * Erzeugt eine Datumsinstanz mit den gegebenen Werten.
     *
     * @param tag   der Tag 1-31 ( abhaengig vom Monat)
     * @param monat das Monat, 1 - 12
     * @param jahr  das Jahr, 1900 - 3000
     */
    public Datum(int tag, int monat, int jahr) {
        int tage = 0;
        int tempMonat = 0;
        if (jahr < 1900) {
            throw new IllegalArgumentException("Jahr kleiner 1900!");
        }
        if (tag <= 0) {
            throw new IllegalArgumentException("Tage kleiner oder gleich 0!");
        }
        if (monat <= 0 || monat > 12) {
            throw new IllegalArgumentException();
        }
        if (isSchaltjahr(jahr) && monat == 2) {
            if (tag > 29) {
                throw new IllegalArgumentException();
            }
            tage = 29;
            if (tag > 29) {
                tempMonat++;
            }
        }
        if (!isSchaltjahr(jahr) && monat == 2) {
            if (tag > 28) {
                throw new IllegalArgumentException();
            }
            tage = 28;
            if (tag > 28) {
                tempMonat++;
            }
        }
        if (monat == 1 || monat == 3 || monat == 5 || monat == 7 || monat == 8 || monat == 10 || monat == 12) {
            if (tag > 31) {
                throw new IllegalArgumentException();
            }
            tage = 31;
            if (tag > 31) {
                tempMonat++;
            }
        } else {
            if (tag > 30) {
                throw new IllegalArgumentException();
            }
            tage = 30;
            if (tag > 30) {
                tempMonat++;
            }
        }
        tag = tage;
        monat = tempMonat;
        jahr = jahr;
    }

    /**
     * Liefert die zwischen zwei Daten vergangenen Tage.
     *
     * @param d1 das erste Datum
     * @param d2 das zweite Datum
     * @return Tage zwischen <code>d1</code> und <code>d2</code>;
     * positiv wenn <code>d2</code> nach <code>d1</code> liegt, sonst negativ
     */
    public static int tageZwischen(Datum d1, Datum d2) {
        int monate = (d1.jahr - d2.jahr) * 12;
        int tage1 = 0;
        int tage2 = 0;

        if (isSchaltjahr(d1.jahr) && d1.monat == 2) {
            tage1 += 29;
        }
        if (!isSchaltjahr(d1.jahr) && d1.monat == 2) {
            tage1 += 28;
        }
        if (d1.monat == 1 || d1.monat == 3 || d1.monat == 5 || d1.monat == 7 || d1.monat == 8 || d1.monat == 10 || d1.monat == 12 && d1.tag > 31) {
            tage1 += 31;
        }
        if (d1.monat == 4 || d1.monat == 6 || d1.monat == 9 || d1.monat == 11 && d1.tag > 30) {
            tage1 += 30;
        }
        if (isSchaltjahr(d2.jahr) && d2.monat == 2) {
            tage2 += 29;
        }
        if (!isSchaltjahr(d2.jahr) && d2.monat == 2) {
            tage2 += 28;
        }
        if (d2.monat == 1 || d2.monat == 3 || d2.monat == 5 || d2.monat == 7 || d2.monat == 8 || d2.monat == 10 || d2.monat == 12 && d2.tag > 31) {
            tage2 += 31;
        }
        if (d2.monat == 4 || d2.monat == 6 || d2.monat == 9 || d2.monat == 11 && d2.tag > 30) {
            tage2 += 30;
        }

        return tage1 - tage2;
    }

    /**
     * Prüft auf Schaltjahr.
     *
     * @param jahr die zu prüfende Jahreszahl
     * @return <code>true</code>, wenn <code>jahr</code> ein Schaltjahr ist, <code>false</code> sonst
     */
    public static boolean isSchaltjahr(int jahr) {
        if ((jahr % 400) == 0) {
            return true;
        }
        if ((jahr % 100) == 0) {
            return false;
        }
        if ((jahr % 4) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Datum datum = (Datum) o;
        return tag == datum.tag &&
                monat == datum.monat &&
                jahr == datum.jahr;
    }

    /**
     * Liefert den Namen des Monats.
     *
     * @return den Monatsnamen
     */
    public String getMonatAsString() {
        if (monat == 1) {
            return "Jänner";
        }
        if (monat == 2) {
            return "Februar";
        }
        if (monat == 3) {
            return "März";
        }
        if (monat == 4) {
            return "April";
        }
        if (monat == 5) {
            return "Mai";
        }
        if (monat == 6) {
            return "Juni";
        }
        if (monat == 7) {
            return "Juli";
        }
        if (monat == 8) {
            return "August";
        }
        if (monat == 9) {
            return "September";
        }
        if (monat == 10) {
            return "Oktober";
        }
        if (monat == 11) {
            return "November";
        }
        if (monat == 12) {
            return "Dezember";
        } else {
            return "Ungueltig";
        }
    }

    /**
     * Erhöht (vermindert) das gespeicherte Datum. Liegt nach dieser
     * Operation das Datum vor dem 1.1.1900,
     * so wird eine IllegalArgumentException geworfen und keine Änderung durchgeführt.
     *
     * @param t die Tage, um die dieses Datum erhöht (t > 0) bzw. vermindert (t < 0) wird
     */
    public void addiereTage(int t) {
        if (jahr < 1900) {
        throw new IllegalArgumentException();
        }
        if (t > 0) {
            for (int i = 0; i < t; i++) {
                tag++;
                if (isSchaltjahr(jahr) && monat == 2 && tag > 29) {
                    monat++;
                    tag = tag - 29;
                }
                if (!isSchaltjahr(jahr) && monat == 2 && tag > 28) {
                    monat++;
                    tag = tag - 28;
                }
                if (monat == 1 || monat == 3 || monat == 5 || monat == 7 || monat == 8 || monat == 10 || monat == 12 && tag > 31) {
                    monat++;
                    tag = tag - 31;
                }
                if (monat == 4 || monat == 6 || monat == 9 || monat == 11 && tag > 30) {
                    monat++;
                    tag = tag - 30;
                }
                if (monat > 12) {
                    jahr++;
                }
            }
        }
        if (t < 0) {
            for (int j = 0; j < +t; j++) {
                tag--;
                if (isSchaltjahr(jahr) && monat == 2 && tag == 0) {
                    monat--;
                    tag = tag + 29;
                }
                if (!isSchaltjahr(jahr) && monat == 2 && tag == 0) {
                    monat--;
                    tag = tag + 28;
                }
                if (monat == 1 || monat == 3 || monat == 5 || monat == 7 || monat == 8 || monat == 10 || monat == 12 && tag == 0) {
                    monat--;
                    tag = tag + 31;
                }
                if (monat == 4 || monat == 6 || monat == 9 || monat == 11 && tag == 0) {
                    monat--;
                    tag = tag + 30;
                }
                if (monat < 12) {
                    jahr--;
                }

            }
        }

    }


    /**
     * Liefert die Nummer des Wochentages.
     *
     * @return die Nummer des Wochentages im Bereich von 0(Montag) bis 6(Sonntag)
     */
    public int wochentagNummer() {
        return (int) ((tag + (2.6 * monat -0.2) + jahr%10 + ((jahr%10)/4) + ((jahr%100)/4) - 2 * jahr%100) % 6);
    }

    /**
     * Liefert den Wochentag als String.
     *
     * @return den Wochentag als String
     */
    public String wochentag() {
        if (wochentagNummer() == 0) {
            return "Monatg";
        }
        if (wochentagNummer() == 1) {
            return "Dienstag";
        }
        if (wochentagNummer() == 2) {
            return "Mittwoch";
        }
        if (wochentagNummer() == 3) {
            return "Donnerstag";
        }
        if (wochentagNummer() == 4) {
            return "Freitag";
        }
        if (wochentagNummer() == 5) {
            return "Samstag";
        }
        if (wochentagNummer() == 6) {
            return "Sonntag";
        }
        else {
            return "Ungueltig";
        }
    }

    /**
     * Vergleicht das <code>this</code>-Datum mit dem übergebenen.
     *
     * @param d das Datum, mit dem verglichen wird
     * @return eine negative Zahl, wenn d spaeter liegt, positiv, wenn d frueher l i egt und
     * 0 bei gleichem Datum
     */
    public int compareTo(Datum d) {
        if (d.monat < monat && d.jahr < jahr) {
            return 1;
        }
        if (d.monat > monat && d.jahr > jahr) {
            return -1;
        }
        else {
            return 0;
        }
    }

    /**
     * Liefert eine Stringdarstellung i n der Form <code>tt.mm.jjjj</code>
     *
     * @return Stringdarstellung i n der Form <code>tt.mm.jjjj</code>QA QA
     * @override
     */
    @Override
    public String toString() {
        return String.format("%02d", tag) + "." + String.format("%02d", monat) + "." + jahr;
    }

    /**
     * Liefert eine Stringdarstellung unterschiedlichen Formats
     *
     * @param format Moegliche Werte sind:
     *               <code>Datum.FORMAT_SHORT, Datum.FORMAT_NORMAL, Datum.FORMAT_LONG, Datum.FORMAT_US</code>
     * @return Datum im Format <code>dd.mm.yy</code> bei <code>Datum.FORMAT_SHORT</code>,
     * im Format <code>dd.monat jjjj, wochentag (Monat ausgeschrieben)</code> bei
     * <code>Datum.FORMAT_LONG</code>, im Format <code>jjjj/tt/mm</code> bei
     * <code>Datum.FORMAT_US</code>
     */
    public String toString(int format) {
        if (format == FORMAT_SHORT) {
            return String.format("%02d", tag) + "." + String.format("%02d", monat) + " " + jahr % 100;
        }
        if (format == FORMAT_NORMAL) {
            return String.format("%02d", tag) + "." + String.format("%02d", monat) + "." + jahr;
        }
        if (format == FORMAT_LONG) {
            return String.format("%02d", tag) + "." + getMonatAsString() + " " + jahr;
        }
        if (format == FORMAT_US) {
            return jahr + "/" + String.format("%02d", tag) + "/" + String.format("%02d", monat);
        } else {
            return "Ungueltig";
        }
    }
}
