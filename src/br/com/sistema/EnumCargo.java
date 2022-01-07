package br.com.sistema;

public enum EnumCargo implements StringValueEnum{
    CARGO1("CARGO1","Gerente Geral"),
    CARGO2("CARGO2","Gerente de Departamento"),
    CARGO3("CARGO3","Líder Técnico"),
    CARGO4("CARGO4","Colaborador"),
    SCARGO("SCARGO","Demitido");

    private final String value;
    private final String displayName;

    EnumCargo(String value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public String getDisplayName() {
        return this.displayName;
    }
}
