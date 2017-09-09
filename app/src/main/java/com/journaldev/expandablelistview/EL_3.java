package com.journaldev.expandablelistview;

/**
 * Created by Chandan on 8/14/2017.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EL_3 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> eops = new ArrayList<String>();
        String eops1 = "Unit-I Power System Components:\n" +
                "Single line Diagram of Power system,Brief description of power system Elements: Synchronous machine, transformer, transmission line, bus bar circuit breaker and isolator Supply System Different kinds of supply system and their comparison, choice of transmission voltage Transmission Lines:Configurations, types of conductors, resistance of line, skin effect, Kelvin’s law.Proximity effect\n\n" +
                "Unit-II Over Head Transmission Lines\n" +
                "Calculation of inductance and capacitance of single phase, three phase, single circuit and double circuit  transmission lines,Representation and performance of short, medium and long transmission lines, Ferranti effect. Surge impedance loading\n\n" +
                "Unit-III Corona and Interference:\n" +
                "Phenomenon of corona, corona formation, calculation of potential gradient, corona loss, factors affecting corona, methods of reducing corona and interference.Electrostatic and electromagnetic interference with communication lines Overhead line Insulators:Type of insulators and their applications, potential distribution over a string of insulators, methods of equalizing the potential, string efficiency\n\n" +
                "Unit-IV Mechanical Design of transmission line:" +
                "Catenary curve, calculation of sag & tension, effects of wind and ice loading, sag template, vibration dampers  Insulated cables:Type of cables and their construction, dielectric stress, grading of cables, insulation resistance, capacitance of single phase and three phase cables, dielectric loss, heating of cables.\n\n" +
                "Unit-V Neutral grounding:\n" +
                "Necessity of neutral grounding, various methods of neutral grounding, earthing transformer, grounding practices Electrical Design of Transmission Line:Design consideration of EHV transmission lines, choice of voltage, number of circuits, conductor configuration, insulation design, selection of ground wires.EHV AC and HVDC Transmission:Introduction to EHV AC and HVDC transmission lines.";
        eops.add(eops1);


        List<String> apaa = new ArrayList<String>();
        String apa = "Unit I:Introduction to Protection System:\n" +
                "Introduction to protection system and its elements, functions of protective relaying, protective zones, primary and backup protection, desirable qualities of protective relaying, basic terminology. Relays: Electromagnetic, attracted and induction type relays, thermal relay, gas actuated relay, design considerations of electromagnetic relay.\n\n" +
                "Unit-II:Relay Application and Characteristics: \n" +
                "Amplitude and phase comparators, over current relays, directional relays, distance relays, differential relay Static Relays:Comparison with electromagnetic relay, classification and their description, over current relays, directional relay, distance relays, differential relay.\n\n" +
                "Unit-III Protection of Transmission Line:\n" +
                "Over current protection, distance protection, pilot wire protection, carrier current protection, protection of bus, auto re-closing,\n\n" +
                "Unit-IV:Circuit Breaking: \n" +
                "Properties of arc, arc extinction theories, re-striking voltage transient, current chopping, resistance switching, capacitive current interruption, short line interruption, circuit breaker ratings. Testing Of Circuit Breaker:Classification, testing station and equipments, testing procedure, direct and indirect testing\n\n" +
                "Unit-V Apparatus Protection:\n" +
                "Protection of Transformer, generator and motor.";
        apaa.add(apa);

        List<String> cs = new ArrayList<String>();
        String sa = "Unit-I Power semiconductor Devices:\n" +
                "Power semiconductor devices their symbols and static characteristics, specifications of switches, types of power electronic circuits,Operation, steady state & switch characteristics & switching limits of Power Transistor Operation and steady state characteristics of Power MOSFET and IGBT Thyristor – Operation V- I characteristics, two transistor model, methods of turn-on Operation of GTO, MCT and TRIAC\n\n" +
                "Unit-II Power Semiconductor Devices (Contd.)\n" +
                "Protection of devices, Series and parallel operation of thyristors Commutation techniques of thyristor DC-DC Converters: Principles of step-down chopper, step down chopper with R-L load Principle of step-up chopper, and operation with RL load, classification of choppers and their various applications.\n\n" +
                "Unit-III Phase Controlled Converters: \n" +
                "Single phase half wave controlled rectifier with resistive and inductive loads, effect of freewheeling diode. Single phase fully controlled and half controlled bridge converters. Performance Parameters Three phase half wave converters, three phase fully controlled and half controlled bridge converters, Effect of source impedance Single phase and three phase dual converters\n\n" +
                "Unit-IV:AC Voltage Controllers:\n" +
                "Principle of On-Off and phase controls Single phase ac voltage controller with resistive and inductive loads Three phase ac voltage controllers (various configurations and comparison only) Single phase transformer taps changer, industrial applications. Cyclo Converters Basic principle of operation, single phase to single phase, three phase to single phase and three phase to three phase cyclo converters, output voltage equation and their applications.\n\n" +
                "Unit-V Inverters:\n" +
                "Single phase series resonant inverter,Single phase bridge inverters,Three phase bridge inverters Voltage control of inverters,Harmonics reduction techniques,Single phase and three phase current source inverters\n";
        cs.add(sa);
        List<String> ccc = new ArrayList<String>();
        String ccs = "Unit-I The Control System:\n" +
                "Open loop & closed control; servomechanism, Physical examples. Transfer functions, Block diagram algebra, Signal flow graph, Mason’s gain formula Reduction of parameter variation and effects of disturbance by using negative feedback\n\n" +
                "Unit-II Time Response analysis:\n" +
                "Standard test signals, time response of first and second order systems, time response specifications,steady state errors and error constants Design specifications of second order systems: Derivative error, derivative output, integral error and PID compensations, design considerations for higher order systems, performance indices\n\n" +
                "Unit-III Control System Components:\n" +
                "Constructional and working concept of ac servomotor, synchros and stepper motor Stability and Algebraic Criteria concept of stability and necessary conditions, Routh-Hurwitz criteria and limitations.Root Locus Technique:The root locus concepts, construction of root loci\n\n" +
                "Unit-IVFrequency response Analysis:\n " +
                "Frequency response, correlation between time and frequency responses,polar and inverse polar plots, Bode plots Stability in Frequency Domain:Nyquist stability criterion, assessment of relative stability: gain margin and phase margin, constant M&N circles\n\n" +
                "Unit-V Introduction to Design:\n" +
                "The design problem and preliminary considerations lead, lag and lead-lag networks, design of closedloop systems using compensation techniques in time domain and frequency domain.Review of state variable technique:Review of state variable technique, conversion of state variable model to transfer function model and vice-versa, diagonalization, Controllability and observability and their testing";
        ccc.add(ccs);
        List<String> micro = new ArrayList<String>();
        String mic = "UNIT-I:Introduction to Digital Computer and Microprocessor:\n" +
                "Digital Computers: General architecture and brief description of elements, instruction execution,instruction format, and instruction set, addressing modes, programming system, higher lever languages. Buses and CPU Timings: Bus size and signals, machine cycle timing diagram, instruction timing, processor timing.Microprocessor and Microprocessor Development Systems: Evolution of Microprocessor, Microprocessor architecture and its operations, memory, inputs-outputs (I/Os), data transfer schemes interfacing devices, architecture advancements of microprocessors, typical microprocessor development system.\n\n" +
                "UNIT-II:8-bit Microprocessors.\n" +
                "8085 microprocessor: pin configuration, internal architecture. Timing & Signals: control and status, interrupt: ALU, machine cycles,Instruction Set of 8085:Addressing Modes: Register addressing, direct addressing; register indirect addressing,immediate addressing, and implicit addressing.Instruction format, op-codes, mnemonics, no. of bytes, RTL, variants, no. of machine cycles and T states, addressing modes.Instruction Classification: Data transfer, arithmetic operations, logical operations, branching operation, machine control; Writing assembly Language programs, Assember directives.\n\n" +
                "UNIT-III:16-bit Microprocessors: Architecture:\n" +
                "Architecture of INTEL 8086 (Bus Interface Unit, Execution unit), register organization, memory addressing, memory segmentation,Operating Modes Instruction Set of 8086Addressing Modes: Instruction format:Discussion on instruction Set: Groups: data transfer, arithmetic , logic string, branch control transfer, processor control.Interrupts: Hardware and software interrupts, responses and types.\n\n" +
                "UNIT-IV Fundamental of Programming:\n " +
                "development of algorithms, flowcharts in terms of structures,(series, parallel, if-then-else etc.)Assembler Level Programming: memory space allocation (mother board and user program) Assembler level programs (ASMs)\n\n" +
                "UNIT-V Peripheral Interfacing:\n" +
                "I/O programming: Programmed I/O, Interrupt Driven I/O, DMA I/O interface: serial and parallel communication, memory I/O mapped I/Os. Peripheral Devices: 8237 DMA controller, 8255-Programmable peripheral interface, 8253/8254 Programmable timer/counter.8259 programmable Interrupt Controller";
        micro.add(mic);
        List<String> femtr = new ArrayList<String>();
        String femt = "Unit I\n" +
                "Review of Vector analysis, Rectangular, Cylindrical and Spherical coordinates and their transformation, divergence, gradient and cvrl in different coordinate systems, Electric field intensity, Electric Flux density, Energy and potential.\n\n" +
                "Unit-II\n" +
                "Current and conductors, Dielectrics and capacitance, Poisson’s and Laplace’s equations.\n\n" +
                "Unit-III\n" +
                "Steady magnetic field, magnetic forces, materials and inductance, Time varying field and Maxwell’s equation.\n\n" +
                "Unit-IV\n" +
                "Uniform Plane waves, Plane wave reflection and dispersion\n";
        femtr.add(femt);
        List<String> psa = new ArrayList<String>();
        String psa1 = "Unit-I Representation of Power System Components:\n" +
                "Synchronous machines, Transformers,Transmission lines, One line diagram, Impedance and reactance diagram, per unit System Symmetrical components:Symmetrical Components of unbalanced phasors, power in terms of symmetrical components,sequence impedances and sequence networks.\n\n" +
                "Unit-II Symmetrical fault analysis:\n" +
                "Transient in R-L series circuit, calculation of 3-phase short circuit current and reactance of synchronous machine, internal voltage of loaded machines under transient conditions Unsymmetrical faults:Analysis of single line to ground fault, line-to-line fault and Double Line to ground fault on an unloaded generators and power system network with and without fault impedance.Formation of Zbus using singular transformation and algorithm, computer method for short circuit calculations\n\n" +
                "Unit-III Load Flows:\n" +
                "Introduction, bus classifications, nodal admittance matrix (YBUS ), development of load flo equations,load flow solution using Gauss Siedel and Newton-Raphson method, approximation to N-R method, line flow equations and fast decoupled method\n\n" +
                "Unit-IV Power System Stability:\n" +
                "Stability and Stability limit, Steady state stability study, derivation of Swing equation, transient stability studies by equal area criterion and step-by-step method. Factors affecting steady state and transient stability and methods of improvement\n\n" +
                "Unit-V Traveling Waves:\n" +
                "Wave equation for uniform Transmission lines, velocity of propagation, surge impedance, reflection and transmission of traveling waves under different line loadings. Bewlay’s lattice diagram, protection of equipments and line against traveling waves";
        psa.add(psa1);
        List<String> senn = new ArrayList<String>();
        String sem = "UNIT-I Poly-phase AC Machines:\n" +
                "Construction and performance of double cage and deep bar three phase induction motors;e.m.f. injection in rotor circuit of slip ring induction motor, concept of constant torque and constant power controls, static slip power recovery control schemes (constant torque and constant power)\n\n" +
                "UNIT-II Single phase Induction Motors:\n" +
                "Construction, starting characteristics and applications of split phase, capacitor start,capacitor run, capacitor-start capacitor-run and shaded pole motors.Two Phase AC Servomotors:Construction, torque-speed characteristics, performance and applications.\n\n" +
                "UNIT-III Stepper Motors:\n" +
                "Principle of operation, variable reluctance, permanent magnet and hybrid stepper motors,characteristics, drive circuits and applications.Switched Reluctance Motors:Construction; principle of operation; torque production, modes of operation, drive circuits.\n\n" +
                "UNIT-IV Permanent Magnet Machines:\n" +
                "Types of permanent magnets and their magnetization characteristics, demagnetizing effect,permanent magnet dc motors, sinusoidal PM ac motors, brushless dc motors and their important features and applications, PCB motors.Single phase synchronous motor; construction, operating principle and characteristics of reluctance and hysteresis motors; introduction to permanent magnet generators and applications\n\n" +
                "UNIT-V Single Phase Commutator Motors:\n" +
                "Construction, principle of operation, characteristics of universal and repulsion motors Linear Induction Motors. Construction, principle of operation, Linear force, and applications";
        senn.add(sem);
        List<String> dcs = new ArrayList<String>();
        String dcs1 = "UNIT-I Signal Processing in Digital Control:\n" +
                "Basic digital control system, advantages of digital control and implementation problems,basic discrete time signals, z-transform and inverse z-transform, modeling of sample- hold circuit., pulse transfer function, solution of difference equation by z-Transform method.\n\n" +
                "UNIT-II Design of Digital Control Algorithms:\n" +
                "Steady state accuracy, transient response and frequency response specifications, digital compensator design using frequency response plots and root locus plots.\n\n" +
                "UNIT-III State Space Analysis and Design:\n" +
                "State space representation of digital control system, conversion of state variable models to transfer functions and vice versa, solution of state difference equations, controllability and observability, design of digital control system with state feedback.\n\n" +
                "UNIT-IV Stability of Discrete System:\n" +
                "Stability on the z-plane and Jury stability criterion, bilinear transformation, Routh stability criterion on rth plane.Lyapunov’s Stability in the sense of Lyapunov, stability theorems for continuous and discrete systems, stability analysis using Lyapunov’s method.\n\n" +
                "UNIT-V Optimal digital control :\n" +
                "Discrete Euler Lagrange equation, max. min. principle, optimality & Dynamicprogramming, Different types of problem and their solutions";
        dcs.add(dcs1);
        List<String> fdsp = new ArrayList<String>();
        String fdsp1 = "Unit-I Discrete-Time Signals And Systems:\n" +
                "Sequences, discrete time systems, LTI systems, frequency domain representation of discrete time signals and systems, discrete time signals and frequency domain representation, Fourier Transform.\n" +
                "Discrete Fourier Transform:Discrete Fourier transforms, properties, linear convolution using DFT, DCT\n\n" +
                "Unit-II Sampling of Continuous Time Signals:\n" +
                "Sampling and reconstruction of signals, frequency domain representation of sampling,discrete time processing of continuous time signals, continuous time processing of discrete time signals, changing the sampling rate using discrete time processing, multi rate signal processing, digital processing of analog signals, over sampling and noise shaping in A/ and D/A conversion\n\n" +
                "Unit-III Transform Analysis of LTI Systems:\n" +
                "Frequency response of LTI systems, system functions, frequency response for rational system functions, magnitude-phase relationship, all pass systems, minimum phase systems,and linear systems with generalized linear phase Overview of finite precision numerical effects, effects of coefficient quantization,Effects of round-off noise in digital filters, zero-input limit cycles in fixed point realizations of IIR digital filters.\n\n" +
                "Unit-IV\n" +
                "Filter Design Techniques:\n" +
                "Design of D-T IIR filters from continuous – time filters, design of FIR filters by\n" +
                "windowing, Kaiser Window method, optimum approximations of FIR filters, FIR\n" +
                "equiripple approximation\n" +
                "Unit-V Efficient computation of the DFT:\n" +
                "Goertzel algorithm, decimation in time and decimation in frequency, FFT algorithm,practical considerations, implementation of the DFT using convolution, effects of finite register length.\n" +
                "Fourier Analysis of Signals Using DFT :DFT analysis of sinusoidal signals, time-dependent Fourier transforms: Block convolution,Fourier analysis of non – stationary and stationary random signals, spectrum analysis of random signals using estimates of the autocorrelation sequence";
        fdsp.add(fdsp1);
        List<String> sac = new ArrayList<String>();
        String sass = "Unit-I Neural Networks-1(Introduction & Architecture)\n" +
                "Neuron, Nerve structure and synapse, Artificial Neuron and its model, activation functions,Neural network architecture: single layer and multilayer feed forward networks, recurrent networks.Various learning techniques; perception and convergence rule,Auto-associative and hetro-associative memory\n\n" +
                "Unit-II Neural Networks-II (Back propogation networks)\n" +
                "Architecture: perceptron model, solution, single layer artificial neural network, multilayer perception model; back propogation learning methods, effect of learning rule co-efficient back propagation algorithm, factors affecting backpropagation training, applications.\n\n" +
                "Unit-III Fuzzy Logic-I (Introduction)\n" +
                "Basic concepts of fuzzy logic, Fuzzy sets and Crisp sets, Fuzzy set theory and operations,Properties of fuzzy sets, Fuzzy and Crisp relations, Fuzzy to Crisp conversion.\n\n" +
                "Unit-IV Fuzzy Logic –II (Fuzzy Membership, Rules)\n" +
                "Membership functions, interference in fuzzy logic, fuzzy if-then rules, Fuzzy implication and Fuzzy algorithms, Fuzzyfications & Defuzzificataions, Fuzzy Controller, Industrial applications.\n \n" +
                "Unit-V Fuzzy Neural Networks:\n" +
                "L-R Type fuzzy numbers, fuzzy neutron, fuzzy back propogation (BP), architecture,learning in fuzzy BP, inference by fuzzy BP, applications.";
        sac.add(sass);
        List<String> football = new ArrayList<String>();
        String psim1 = "UNIT-I\n" +
                "Introduction: Energy sources, Energy demand and supply, Energy crisis, Future scenario,Menace of power theft, reasons for power pilferage, electricity loss and theft-National and Global scenario, Security seals and tampering, harmonics and power theft, Control Over power theft.\n\n" +
                "UNIT-II Power Theft in Electro-mechanical Meters:\n " +
                "Power theft in Voltage circuit, bypassin meters, drilling holes on Electro-mechanical Meters, Insertion of film int meter, partial earth fault tampering, Missing Neutral Method.Power Theft in Electronic Meters:Power theft by means of Electrostatic Discharge, by tampering printed circuit board,by tampering the frequency circuit, tampering on display circuits of energy meter,Introducing limit switch.\n\n" +
                "UNIT-III\n" +
                "Energy system efficiency, Energy conservation aspects, Instrumentation and measurements.Principles of Energy Management and Energy Audit: General principles, Planning and program, Introduction to energy audit, General methodology, Site surveys, Energy systems survey, Energy audit, Instrumentation, Analysis of data and results.\n\n" +
                "UNIT-IV Electrical Load and Lighting Management: " +
                "General principles, Illumination and human comfort, Lighting systems, Equipment’s, Electrical systems, Electrical load analysis, Peak load controls.Demand Side Management: Concept and Scope of Demand Side Management, Evolution of Demand Side Management, DSM Strategy ,Planning, Implementation and its application. Customer Acceptance & its implementation issues. National and International Experiences with DSM";
        football.add(psim1);
        List<String> de22 = new ArrayList<String>();
        String de2 = "UNIT-I\n" +
                "Break Down In Gases:Ionization processes, Townsend’s criterion, breakdown in electronegative gases, time lag  for breakdown, streamer theory, Paschen’s law, break down in non-uniform field,breakdown in vacuum.Break Down In Liquid Dielectrics:Classification of liquid dielectric, characteristic of liquid dielectric, breakdown in pure liquid and commercial liquid.Break Down In Solid Dielectrics:Intrinsic breakdown, electromechanical breakdown, breakdown of solid, dielectric in practice, breakdown in composite dielectrics.\n\n" +
                "UNIT-II Generation of High Voltages and Currents:\n" +
                "Generation of high direct current voltages, generation of high alternating voltages,generation of impulse voltages, generation of impulse currents, tripping and control of impulse generators.\n\n" +
                "UNIT-III Measurement of High Voltages and Currents:\n" +
                "Measurement of high direct current voltages, measurement of high alternating and impulse voltages, measurement of high direct, alternating and impulse currents, Cathode Ray Oscillographs for impulse voltage and current measurements.\n\n" +
                "UNIT-IV\n" +
                "Non-Destructive Testing:\n" +
                "Measurement of direct current resistively, measurement of dielectric constant and loss\n" +
                "factor, partial discharge measurements\n" +
                "High Voltage Testing:\n" +
                "Testing of insulators and bushings, testing of isolators and circuit breakers, testing of cables, testing of transformers, testing of surge arresters, radio interference measurements.";
        de22.add(de2);
        List<String> da = new ArrayList<String>();
        String dsd1 = "UNIT-I\n" +
                "Break Down In Gases:\n" +
                "Ionization processes, Townsend’s criterion, breakdown in electronegative gases, time lags for breakdown, streamer theory, Paschen’s law, break down in non-uniform field,breakdown in vacuum.Break Down In Liquid Dielectrics:Classification of liquid dielectric, characteristic of liquid dielectric, breakdown in pure liquid and commercial liquid.Break Down In Solid Dielectrics:Intrinsic breakdown, electromechanical breakdown, breakdown of solid, dielectric in practice, breakdown in composite dielectrics.\n\n" +
                "UNIT-II Generation of High Voltages and Currents:\n" +
                "Generation of high direct current voltages, generation of high alternating voltages,generation of impulse voltages, generation of impulse currents, tripping and control of impulse generators.\n\n" +
                "UNIT-III \n" +
                "Measurement of High Voltages and Currents:\n" +
                "Measurement of high direct current voltages, measurement of high alternating and impulse voltages, measurement of high direct, alternating and impulse currents, Cathode Ray Oscillographs for impulse voltage and current measurements.\n\n" +
                "UNIT-IV" +
                "Non-Destructive Testing Measurement of direct current resistively, measurement of dielectric constant and loss factor, partial discharge measurements High\n"+
                 "Voltage Testing:Testing of insulators and bushings, testing of isolators and circuit breakers, testing of cables, testing of transformers, testing of surge arresters, radio interference measurements.";
                da.add(dsd1);
        List<String> footballa = new ArrayList<String>();
        String Strnr = "UNIT I\n" +
                "Introduction to Smart Grid: Evolution of Electric Grid, Concept of Smart Grid, Definitions, Need of Smart Grid, Functions of Smart Grid, Opportunities & Barriers of Smart Grid, Differencebetween conventional & smart grid, Concept of Resilient & Self Healing Grid, Present development& International policies in Smart Grid. Case study of Smart Grid. CDM opportunities in Smart Grid.\n\n" +
                "UNIT II Smart Grid Technologies:\n" +
                "Part 1: Introduction to Smart Meters, Real Time Prizing, Smart Appliances, Automatic Meter Reading(AMR), Outage Management System(OMS), Plug in Hybrid Electric Vehicles(PHEV), Vehicle to Grid, Smart Sensors, Home & Building Automation, Phase Shifting Transformers.\n" +
                "UNIT III Smart Grid Technologies:\n " +
                "Part 2: Smart Substations, Substation Automation, Feeder Automation. Geographic Information System(GIS), Intelligent Electronic Devices(IED) & thei application for monitoring & protection, Smart storage like Battery, SMES, Pumped Hydro,Compressed Air Energy Storage, Wide Area Measurement System(WAMS), Phase Measurement Unit(PMU).\n\n" +
                "UNIT IV\n" +
                "Microgrids and Distributed Energy Resources: Concept of microgrid, need & applications of microgrid, formation of microgrid, Issues of interconnection, protection & control of microgrid.Plastic & Organic solar cells, thin film solar cells, Variable speed wind generators, fuelcells,microturbines, Captive power plants, Integration of renewable energy sources. \n";
        footballa.add(Strnr);

        expandableListDetail.put("ELEMENTS OF POWER SYSTEM", eops);
        expandableListDetail.put("POWER ELECTRONICS", cs);
        expandableListDetail.put("CONTROL SYSTEM", ccc);
        expandableListDetail.put("MICROPROCESSORS\n", micro);
        expandableListDetail.put("FUNDAMENTALS OF E.M.THEORYNEC-508: FUNDAMENTALS OF E.M.THEORY", femtr);
        expandableListDetail.put("POWER SYSTEM ANALYSIS", psa);
        expandableListDetail.put("SWITCHGEAR AND PROTECTION", apaa);
        expandableListDetail.put("SPECIAL ELECTRICAL MACHINES", senn);
        expandableListDetail.put("Digital Control System(DE-I)", dcs);
        expandableListDetail.put("FUNDAMENTALS OF DIGITAL SIGNAL PROCESSING", fdsp);
        expandableListDetail.put("NEURAL NETWORKS AND FUZZY SYSTEM", sac);
        expandableListDetail.put("POWER THEFT AND ENERGY MANAGEMENT", de22);
        expandableListDetail.put("HIGH VOLTAGE ENGINEERING(DE-II)", da);
        expandableListDetail.put("SMART ENERGY DELIVERY SYSTEMS", footballa);
        return expandableListDetail;
    }
}