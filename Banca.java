package Ereditarietà;

public class Banca {
    public float gettasso() {
        return 0f; // Implementazione di base, verrà sovrascritta dalle sottoclassi
    }
}

// Sottoclasse per la banca SBI
class SBI extends Banca {
    public float gettasso() {
        return 8.0f; // Tasso di interesse per SBI
    }
}

// Sottoclasse per la banca ICICI
class ICICI extends Banca {
    public float gettasso() {
        return 7.0f; // Tasso di interesse per ICICI
    }
}

// Sottoclasse per la banca AXIS
class AXIS extends Banca {
    public float gettasso() {
        return 9.0f; // Tasso di interesse per AXIS
    }
}