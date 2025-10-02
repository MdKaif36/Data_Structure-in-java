
import java.util.*;

public class TCSsolution1 {
    static class Gate {
        String name;
        String type;
        String input1;
        String input2;

        Gate(String definition) {
            String[] parts = definition.split("=");
            this.name = parts[0].trim();
            String[] gateParts = parts[1].trim().split("\\(");
            this.type = gateParts[0].trim();
            String inputs = gateParts[1].substring(0, gateParts[1].length() - 1);
            String[] inputNames = inputs.split(",");
            this.input1 = inputNames[0].trim();
            this.input2 = inputNames[1].trim();
        }

        public String getOutput(List<Integer> cycleOutputs) {
            List<Integer> output = new ArrayList<>();
            int previousOutput = 0; // Initial output of any gate is 0
            for (int i = 0; i < cycleOutputs.size(); i++) {
                int input1Value = (i == 0) ? 0 : cycleOutputs.get(i - 1);
                int input2Value = (i == 0) ? 0 : cycleOutputs.get(i - 1);
                if (input1Value == -1) {
                    input1Value = previousOutput;
                } else {
                    input1Value = cycleOutputs.get(i);
                }
                if (input2Value == -1) {
                    input2Value = previousOutput;
                } else {
                    input2Value = cycleOutputs.get(i);
                }
                
                switch (type) {
                    case "AND":
                        previousOutput = input1Value & input2Value;
                        break;
                    case "OR":
                        previousOutput = input1Value | input2Value;
                        break;
                    case "NAND":
                        previousOutput = ~(input1Value & input2Value) & 1; // NAND
                        break;
                    case "NOR":
                        previousOutput = ~(input1Value | input2Value) & 1; // NOR
                        break;
                    case "XOR":
                        previousOutput = input1Value ^ input2Value;
                        break;
                }
                output.add(previousOutput);
            }
            return String.join(" ", output.stream().map(String::valueOf).toArray(String[]::new));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        Map<String, Gate> gates = new HashMap<>();
        Map<String, List<Integer>> inputs = new HashMap<>();

        // Read gates
        for (int i = 0; i < N; i++) {
            String gateDefinition = scanner.nextLine().trim();
            gates.put(gateDefinition.split("=")[0].trim(), new Gate(gateDefinition));
        }

        // Read number of cycles
        int T = Integer.parseInt(scanner.nextLine().trim());

        // Read inputs
        for (int i = 0; i < T; i++) {
            String[] inputLine = scanner.nextLine().trim().split(" ");
            String inputName = inputLine[0];
            List<Integer> cycleValues = new ArrayList<>();
            for (int j = 1; j < inputLine.length; j++) {
                cycleValues.add(Integer.parseInt(inputLine[j]));
            }
            inputs.put(inputName, cycleValues);
        }

        // Read the gate whose output is required
        String outputGateName = scanner.nextLine().trim();
        Gate outputGate = gates.get(outputGateName);

        // Compute outputs for all gates
        Map<String, List<Integer>> gateOutputs = new HashMap<>();

        for (Gate gate : gates.values()) {
            List<Integer> input1Values = gateOutputs.getOrDefault(gate.input1, inputs.get(gate.input1));
            List<Integer> input2Values = gateOutputs.getOrDefault(gate.input2, inputs.get(gate.input2));
            List<Integer> cycleOutputs = new ArrayList<>();

            for (int cycle = 0; cycle < T; cycle++) {
                int input1Value = cycle > 0 ? input1Values.get(cycle - 1) : 0;
                int input2Value = cycle > 0 ? input2Values.get(cycle - 1) : 0;

                int outputValue = 0;
                switch (gate.type) {
                    case "AND":
                        outputValue = input1Value & input2Value;
                        break;
                    case "OR":
                        outputValue = input1Value | input2Value;
                        break;
                        case "NAND":
                        outputValue = ~(input1Value & input2Value) & 1; // NAND
                        break;
                    case "NOR":
                        outputValue = ~(input1Value | input2Value) & 1; // NOR
                        break;
                    case "XOR":
                         outputValue = input1Value ^ input2Value;
                        break;
                }

            }
        }
    }
}
