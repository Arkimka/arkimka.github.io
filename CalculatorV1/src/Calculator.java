public class Calculator {
    
    private final Converter converter;

    public Calculator() 
    {
        this.converter = new Converter();
    }

    public String calc(String [] args) 
    {
        if (args.length!=3) throw new IllegalArgumentException();
        try 
        {
            int result = calc(Integer.parseInt(args[0]), Integer.parseInt(args[2]), args[1]);
            return String.valueOf(result);
        } 
        catch (NumberFormatException e) 
        {
                int result = calc (converter.toArabic(args[0]), converter.toArabic(args[2]), args[1]);
                return converter.toRoman(result);
        }
    }
    
    private int calc(int f, int s, String oper) 
    {
        if (f < 1 || f > 10 || s < 1 || s > 10) throw new IllegalArgumentException();
        switch (oper) 
        {
            case "+": return f + s;
            case "/": return f / s;
            case "*": return f * s;
            case "-": return f - s;
            default: throw new IllegalArgumentException();
        }
    }
    
}