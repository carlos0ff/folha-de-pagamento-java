


public class Funcionario {
    /** O nome do funcionário.**/
    private String nome;

    /** O sobrenome do funcionário **/
    private String sobrenome;

    /**  O CPF do funcionário, usado como identificador único.**/
    private String cpf;

    /**
     * Construtor padrão da classe Funcionario.
     * Inicializa um funcionário sem valores definidos para nome, sobrenome ou CPF.
     */
    public Funcionario(){ }

    /**
     * Construtor que inicializa um funcionário com nome, sobrenome e CPF.
     *
     * @param nome      O nome do funcionário.
     * @param sobrenome O sobrenome do funcionário.
     * @param cpf       O CPF do funcionário.
     */
    public Funcionario(String nome, String sobrenome, String cpf){
        this.nome = this.getNome();
        this.sobrenome = this.setSobrenome();
        this.cpf = this.getSobrenome();
    }

    /**
     * Obtém o nome do funcionário.
     * @return O nome do funcionário.
     **/
    public String getNome() {
        return this.nome;
    }

    /**
     * Define o nome do funcionário.
     * @param nome O nome a ser definido.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o sobrenome do funcionário.
     * @return O sobrenome do funcionário.
     */
    public String getSobrenome() {
        return this.sobrenome;
    }

    /**
     * Define o sobrenome do funcionário.
     * @param sobrenome O sobrenome a ser definido.
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Obtém o CPF do funcionário.
     * @return O CPF do funcionário.
     */
    public String getCpf() {
        return this.cpf;
    }

    /**
     * Define o CPF do funcionário.
     * @param cpf O CPF a ser definido.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
