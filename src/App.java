@Tabela(value = "Nome da Tabela")
public class App {

    public static void main(String[] args) {
        Class<App> appClass = App.class;
        if (appClass.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = appClass.getAnnotation(Tabela.class);
            System.out.println("Valor da anotação Tabela: " + tabela.value());
        }
    }
}
