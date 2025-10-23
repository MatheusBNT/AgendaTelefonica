import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Agenda {
    private List<Telefone> telefones = new ArrayList<>();

    public void addTelefone(Telefone telefone) {
        telefones.add(telefone);
        System.out.println("Telefone adicionado!");
    }


    public Telefone findTelefoneByName(List<Telefone> telefones, String name) {
        Pattern pattern = Pattern.compile(name, Pattern.CASE_INSENSITIVE);
        for (Telefone telefone : telefones) {
            Matcher matcher = pattern.matcher(telefone.getNome());
            if (matcher.matches()) {
                telefone.mostrarInfo();
                return telefone;
            }
        }
        System.out.println("Telefone não encontrado!");
        return null;
    }

    public void agenda01(){
        Telefone telefone01 = new Telefone("Matheus", 11, 945734745);
        Telefone telefone02 = new Telefone("Gustavo", 12, 918263986);
        Telefone telefone03 = new Telefone("Zé", 10, 123091008);
        addTelefone(telefone01);
        addTelefone(telefone02);
        addTelefone(telefone03);
        findTelefoneByName(telefones, "");
    }
}
