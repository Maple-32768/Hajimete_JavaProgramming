public class ChemicalElement {
    public final int number;
    public final String symbol;
    public final String name;

    public ChemicalElement(int number, String symbol, String name){
        this.number = number;
        this.symbol = symbol;
        this.name = name;
    }

    public static final ChemicalElement[] ELEMENTS = {
            new ChemicalElement(1, "H", "水素"),
            new ChemicalElement(2, "He", "ヘリウム"),
            new ChemicalElement(3, "Li", "リチウム"),
            new ChemicalElement(4,"Be","ベリリウム"),
            new ChemicalElement(5,"B","ホウ素"),
            new ChemicalElement(6,"C","炭素"),
            new ChemicalElement(7,"N","窒素"),
            new ChemicalElement(8,"O","酸素"),
            new ChemicalElement(9,"F","フッ素"),
            new ChemicalElement(10,"Ne","ネオン"),
            new ChemicalElement(11,"Na","ナトリウム"),
            new ChemicalElement(12,"Mg","マグネシウム"),
            new ChemicalElement(13,"Al","アルミニウム"),
            new ChemicalElement(14,"Si","ケイ素"),
            new ChemicalElement(15,"P","リン"),
            new ChemicalElement(16,"S","硫黄"),
            new ChemicalElement(17,"Cl","塩素"),
            new ChemicalElement(18,"Ar","アルゴン"),
            new ChemicalElement(19,"K","カリウム"),
            new ChemicalElement(20,"Ca","カルシウム"),
            null
    };
}
