package laChiqui;

public class Main {
  public static void main(String[] args) {
    Evento evento = new Evento("La Chiqui");

    evento.IncluirConvidado(new ConvidadoStandard("Antônio"));
    evento.IncluirConvidado(new ConvidadoMeli("Arthur"));
    evento.IncluirConvidado(new ConvidadoStandard("Bruna"));
    evento.IncluirConvidado(new ConvidadoStandard("Carlos"));
    evento.IncluirConvidado(new ConvidadoMeli("Denise"));
    evento.IncluirConvidado(new ConvidadoStandard("Eduardo"));
    evento.IncluirConvidado(new ConvidadoStandard("Fábia"));
    evento.IncluirConvidado(new ConvidadoStandard("Gustavo"));
    evento.IncluirConvidado(new ConvidadoMeli("Heitor"));
    evento.IncluirConvidado(new ConvidadoStandard("Ilda"));
    evento.IncluirConvidado(new ConvidadoStandard("Joana"));
    evento.IncluirConvidado(new ConvidadoStandard("Karla"));
    evento.IncluirConvidado(new ConvidadoStandard("Lucas"));
    evento.IncluirConvidado(new ConvidadoMeli("Larissa"));
    evento.IncluirConvidado(new ConvidadoStandard("Matheus"));
    evento.IncluirConvidado(new ConvidadoStandard("Neiva"));
    evento.IncluirConvidado(new ConvidadoStandard("Otávio"));
    evento.IncluirConvidado(new ConvidadoStandard("Paulo"));
    evento.IncluirConvidado(new ConvidadoStandard("Quézia"));
    evento.IncluirConvidado(new ConvidadoMeli("Raul"));
    evento.IncluirConvidado(new ConvidadoMeli("Ricardo"));
    evento.IncluirConvidado(new ConvidadoStandard("Renato"));
    evento.IncluirConvidado(new ConvidadoStandard("Sarah"));
    evento.IncluirConvidado(new ConvidadoStandard("Tomé"));
    evento.IncluirConvidado(new ConvidadoMeli("Ulisses"));
    evento.IncluirConvidado(new ConvidadoStandard("Verônica"));
    evento.IncluirConvidado(new ConvidadoStandard("Washington"));
    evento.IncluirConvidado(new ConvidadoMeli("Xuxa"));
    evento.IncluirConvidado(new ConvidadoStandard("Zilu"));

    evento.ComerBolo();

    var pacote1 = new PacoteFogos();
    pacote1.incluirFogos(new FogosIndividuais("PACOTE 1 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote1.incluirFogos(new FogosIndividuais("PACOTE 1 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote1.incluirFogos(new FogosIndividuais("PACOTE 1 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote1.incluirFogos(new FogosIndividuais("PACOTE 1 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote1.incluirFogos(new FogosIndividuais("PACOTE 1 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));

    var pacote2 = new PacoteFogos();
    pacote2.incluirFogos(new FogosIndividuais("PACOTE 2 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote2.incluirFogos(new FogosIndividuais("PACOTE 2 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote2.incluirFogos(new FogosIndividuais("PACOTE 2 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote2.incluirFogos(new FogosIndividuais("PACOTE 2 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote2.incluirFogos(new FogosIndividuais("PACOTE 2 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));

    var pacote3 = new PacoteFogos();
    pacote3.incluirFogos(new FogosIndividuais("PACOTE 3 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote3.incluirFogos(new FogosIndividuais("PACOTE 3 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote3.incluirFogos(new FogosIndividuais("PACOTE 3 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote3.incluirFogos(new FogosIndividuais("PACOTE 3 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote3.incluirFogos(new FogosIndividuais("PACOTE 3 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote3.incluirFogos(pacote2);

    var pacote5 = new PacoteFogos();
    pacote5.incluirFogos(new FogosIndividuais("PACOTE 5 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote5.incluirFogos(new FogosIndividuais("PACOTE 5 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote5.incluirFogos(new FogosIndividuais("PACOTE 5 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote5.incluirFogos(new FogosIndividuais("PACOTE 5 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote5.incluirFogos(new FogosIndividuais("PACOTE 5 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));

    var pacote4 = new PacoteFogos();
    pacote4.incluirFogos(new FogosIndividuais("PACOTE 4 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote4.incluirFogos(new FogosIndividuais("PACOTE 4 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote4.incluirFogos(new FogosIndividuais("PACOTE 4 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote4.incluirFogos(new FogosIndividuais("PACOTE 4 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote4.incluirFogos(new FogosIndividuais("PACOTE 4 - " + String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    pacote4.incluirFogos(pacote3);
    pacote4.incluirFogos(pacote5);

    evento.IncluirFogos(new FogosIndividuais(String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    evento.IncluirFogos(new FogosIndividuais(String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    evento.IncluirFogos(new FogosIndividuais(String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    evento.IncluirFogos(pacote1);
    evento.IncluirFogos(new FogosIndividuais(String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    evento.IncluirFogos(new FogosIndividuais(String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    evento.IncluirFogos(new FogosIndividuais(String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    evento.IncluirFogos(new FogosIndividuais(String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    evento.IncluirFogos(new FogosIndividuais(String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    evento.IncluirFogos(new FogosIndividuais(String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    evento.IncluirFogos(new FogosIndividuais(String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    evento.IncluirFogos(new FogosIndividuais(String.format("B%1$" + getRandom() + "sM", "").replace(' ', 'O')));
    evento.IncluirFogos(pacote4);

    evento.ExplodirFogos();
  }

  private static int getRandom() {
    return (int)((Math.random() * 6) + 3);
  }
}
