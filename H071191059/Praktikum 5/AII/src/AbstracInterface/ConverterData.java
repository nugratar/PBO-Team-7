package AbstracInterface;

public class ConverterData extends Converter implements Data {
    @Override
    public void start() {
        System.out.println("Data Converter is started");
    }

    @Override
    public void stop() {
        System.out.println("Data Converter is terminated");
    }
    @Override
    public long teraToGiga(long value) {
        return value *= 1024;
    }

    @Override
    public long teraToMega(long value) {
        return (long) (value * (Math.pow(1024, 2)));
    }

    @Override
    public long teraToKilo(long value) {
        return (long) (value * (Math.pow(1024, 3)));
    }
}