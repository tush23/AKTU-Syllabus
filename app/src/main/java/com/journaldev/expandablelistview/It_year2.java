package com.journaldev.expandablelistview;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class It_year2 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        String m3 ="Unit – I: Function of Complex variable\n" +
                "Analytic function, C-R equations, Harmonic Functions, Cauchy’s integral theorem, Cauchy’s integral formula, Derivatives of analytic functions, Taylor’s and Laurent’s series, Singularities, Zeroes and Poles, Residue theorem, Evaluation of real integrals of the type\n\n" +
                "Unit – II: Integral Transforms\n" +
                "Fourier integral, Complex Fourier transform, Inverse Transforms, Convolution Theorems, Fourier sine and cosine transform, Applications of Fourier transform to simple one dimensional heat transfer equations, wave equations and Laplace equations Z- transform and its application to solve difference equations\n\n" +
                "Unit – III: Statistical Techniques \n" +
                "Moments, Moment generating functions, Skewness, Kurtosis, Curve fitting, Method of least squares, Fitting of straight lines, Polynomials, Exponential curves, Correlation, Linear, non – linear and multiple regression analysis, Binomial, Poisson and Normal distributions, Tests of significations: Chi-square test, t-test\n\n" +
                "Unit – IV: Numerical Techniques – I \n" +
                "Zeroes of transcendental and polynomial equations using Bisection method, Regula-falsi method and Newton-Raphson method, Rate of convergence of above methods. Interpolation: Finite differences, Newton’s forward and backward interpolation, Lagrange’s and Newton’s divided difference formula for unequal intervals.\n\n" +
                "Unit – V: Numerical Techniques –II \n" +
                "Solution of system of linear equations, Matrix Decomposition methods, Jacobi method, Gauss- Seidal method. Numerical differentiation, Numerical integration, Trapezoidal rule, Simpson’s one third and three-eight rules, Solution of ordinary differential equations (first order,second order and simultaneous) by Euler’s, Picard’s and fourth-order Runge- Kutta methods";

        cricket.add(m3);


        List<String> football = new ArrayList<String>();
        String Arch = "Unit-I\n" +
                "Functional units of digital system and their interconnections, buses, bus architecture, types of buses and bus arbitration. Register bus and memory transfer, Processor organization, general register organization, stack organization and addressing modes, Look ahead carry adders. Multiplication: Signed operand multiplication, Booths algorithm and array multiplier. Division and logic operations. Floating point arithmetic operation, Arithmetic & logic unit design.\n\n" +
                "Unit-II\n" +
                "Instruction types, formats, instruction cycles and sub cycles (fetch, execute etc) , microoperations, execution of a complete instruction, Hardwire and micro-programmed control: micro-programme sequencing, concept of horizontal and vertical microprogramming.\n\n" +
                "Unit-III\n" +
                "Basic concept and hierarchy, semiconductor RAM memories, 2D memory organization. ROM memories, Cache memories: concept and design issues & performance, address mapping and replacement, Auxiliary memories: magnetic disk, magnetic tape and optical disks, Virtual memory: concept implementation.\n\n" +
                "Unit-IV\n" +
                "Peripheral devices, I/O interface, I/O ports, Interrupts: interrupt hardware, types of interrupts and exceptions, Modes of Data Transfer: Programmed I/O, interrupt initiated I/O and Direct Memory Access., I/O channels and processors, Serial Communication: Synchronous & asynchronous communication, standard communication interfaces.\n\n" +
                "Unit - V\n" +
                "Architectural Classification Schemes, Flynn’s & Feng’s Classification, Performance Metrics and Measures, Speedup Performance Laws, Pipelining and Memory Hierarchy Basic and Intermediate Concepts, Linear and Nonlinear Pipeline Processors, Optimization of Cache Performance.";

        football.add(Arch);

        List<String> basketball = new ArrayList<String>();
        String data = "Unit - I:Introduction: \n" +
                "Basic Terminology, Elementary Data Organization, Algorithm, Efficiency of an Algorithm, Time and Space Complexity, Asymptotic notations: Big-Oh, Time-Space tradeoff.Abstract Data Types (ADT), Arrays: Definition, Single and Multidimensional Arrays, Representation of Arrays: Row Major Order, and Column Major Order, Application of arrays, Sparse Matrices and their representations. Linked lists: Array Implementation and Dynamic Implementation of Singly Linked Lists, Doubly Linked List, Circularly Linked List, Operations on a Linked List. Insertion, Deletion, Traversal, Polynomial Representation and Addition, Generalized Linked List .\n\n" +
                "Unit – II:Stacks: \n" +
                "Abstract Data Type, Primitive Stack operations: Push & Pop, Array and Linked Implementation of Stack in C, Application of stack: Prefix and Postfix Expressions, Evaluation of postfix expression, Recursion, Tower of Hanoi Problem, Simulating Recursion, Principles of recursion, Tail recursion, Removal of recursion Queues, Operations on Queue: Create, Add, Delete, Full and Empty, Circular queues, Array and linked implementation of queues in C, Dequeue and Priority Queue.\n\n" +
                "Unit – III:Trees:\n" +
                "Basic terminology, Binary Trees, Binary Tree Representation: Array Representation and Dynamic Representation, Complete Binary Tree, Algebraic Expressions, Extende Binary Trees, Array and Linked Representation of Binary trees, Tree Traversal algorithms: Inorder, Preorder and Postorder, Threaded Binary trees, Traversing Threaded Binary trees, Huffman algorithm.\n\n" +
                "Unit – IV:Graphs:\n" +
                "Terminology, Sequential and linked Representations of Graphs: Adjacency Matrices, Adjacency List, Adjacency Multi list, Graph Traversal : Depth First Search and Breadth First Search, Connected Component, Spanning Trees, Minimum Cost Spanning Trees: Prims and Kruskal algorithm. Transitive Closure and Shortest Path algorithm: Warshal Algorithm and Dijikstra Algorithm, Introduction to Activity Networks\n\n" +
                "Unit – V:Searching:\n" +
                "Sequential search, Binary Search, Comparison and Analysis Internal Sorting: Insertion Sort, Selection, Bubble Sort, Quick Sort, Two Way Merge Sort, Heap Sort, Radix Sort, Practical consideration for Internal Sorting.Search Trees: Binary Search Trees (BST), Insertion and Deletion in BST, Complexity of Search Algorithm, AVL trees, Introduction to m-way Search Trees, B Trees & B+ Trees .Hashing: Hash Function, Collision Resolution StrategiesStorage Management: Garbage Collection and Compaction";

        basketball.add(data);

        List<String> dld1 = new ArrayList<String>();
        String desreet ="Unit-I Set Theory: \n" +
                "Introduction, Combination of sets, Multi sets, ordered pairs, Set Identities.Relations: Definition, Operations on relations, Properties of relations, Composite Relations, Equality of relations, Order of relations. Functions: Definition, Classification of functions, Operations on functions, Recursively defined functions. Natural Numbers: Introduction, Mathematical Induction, Variants of Induction, Induction with Nonzero Base cases.\n\n" +
                "Unit-II:Algebraic Structures:\n" +
                "Definition, Groups, Subgroups and order, Cyclic Groups, Cosets, Lagrange's theorem, Normal Subgroups, Permutation and Symmetric groups, Group Homomorphism’s, Definition and elementary properties of Rings and Fields, Integers Modulo n.\n\n" +
                "Unit-III:Partial order sets: \n" +
                "Definition, Partial order sets, Combination of partial order sets, Hasse diagram. Lattices: Definition, Properties of lattices – Bounded, Complemented, Modular and Complete Lattice, Morphisms of lattices. Boolean Algebra: Introduction, Axioms and Theorems of Boolean algebra, Algebraic manipulation of Boolean expressions. Simplification of Boolean Functions, Karnaugh maps, Logic gates, Digital circuits and Boolean algebra. Combinational and sequential Circuits\n\n" +
                "Unit-IV\n" +
                "Propositional Logic: Proposition, well formed formula, Truth tables, Tautology, Satisfiability, Contradiction, Algebra of proposition, Theory of Inference ,Natural Deduction. Predicate Logic: First order predicate, well formed formula of predicate, quantifiers, Inference theory of predicate logic.\n\n" +
                "Unit-V\n" +
                "Trees: Definition, Binary tree, Binary tree traversal, Binary search tree. Graphs: Definition and terminology, Representation of graphs, Multi graphs, Bipartite graphs, Planar graphs, Isomorphism and Homeomorphism of graphs, Euler and Hamiltonian paths, Graph coloring . Recurrence Relation & Generating function: Recursive definition of functions, Recursive algorithms, Method of solving recurrences. Combinatorics: Introduction, Counting Techniques, Pigeonhole Principle ";

        dld1.add(desreet);
        List<String> dld11 = new ArrayList<String>();
        String dl ="Unit-I Digital Design and Binary Numbers:\n" +
                "Binary Arithmetic, Negative Numbers and their Arithmetic, Floating point representation, Binary Codes, Cyclic Codes, Error Detecting and Correcting Codes, Hamming Codes. Minterm and Maxterm Realization of Boolean Functions, Gate-level minimization: The map method up to four variable, don’t care conditions, SOP and POS simplification, NAND and NOR implementation, Quine Mc- Cluskey Method (Tabular method).\n\n" +
                "Unit-II Combinational Logic:\n" +
                "Combinational Circuits, Analysis Procedure, Design Procedure, Binary Adder-Subtractor, Code Converters, Parity Generators and Checkers, Decimal Adder, Binary Multiplier, Magnitude Comparator, Decoders, Encoders, Multiplexers, Hazards and Threshold Logic\n\n" +
                "Unit-III Memory and Programmable Logic Devices:\n" +
                "Semiconductor Memories, RAM, ROM, PLA, PAL, Memory System design.\n\n" +
                "Unit-IV Synchronous Sequential Logic:\n" +
                "Sequential Circuits, Storage Elements: Latches, Flip Flops, Analysis of Clocked Sequential circuits, state reduction and assignments, design procedure. Registers and Counters: Shift Registers, Ripple Counter, Synchronous Counter, Other Counters.\n\n" +
                "Unit-V Asynchronous Sequential Logic:\n" +
                " Analysis procedure, circuit with latches, design procedure, reduction of state and flow table, race free state assignment, hazards";
        dld11.add(dl);

        List<String> cricket1 = new ArrayList<String>();
        String micropr= "UNIT I\n" +
                "Introduction to Microprocessor, Microprocessor architecture and its operations, Memory, Input & output devices, Logic devices for interfacing, The 8085 MPU, Example of an 8085 based computer, Memory interfacing.\n\n" +
                "UNIT II\n" +
                "Basic interfacing concepts, Interfacing output displays, Interfacing input devices, Memory mapped I/O, Flow chart symbols, Data Transfer operations, Arithmetic operations, Logic Operations, Branch operation, Writing assembly language programs, Programming techniques: looping, counting and indexing.\n\n" +
                "UNIT III\n" +
                "Additional data transfer and 16 bit arithmetic instruction, Arithmetic operations related to memory, Logic operation: rotate, compare, counter and time delays, Illustrative program: Hexadecimal counter, zero-to-nine, (module ten) counter, generating pulse waveforms, debugging counter and time delay, Stack, Subroutine, Restart, Conditional call and return instructions, Advance subroutine concepts, The 8085 Interrupts, 8085 vector interrupts.\n\n" +
                "UNIT IV\n" +
                "Program: BCD-to-Binary conversion, Binary-to-BCD conversion, BCD-to-Seven segment code converter, Binary-to-ASCII and ASCII-to-Binary code conversion, BCD Addition, BCD Subtraction, Introduction to Advance instructions and Application, Multiplication, Subtraction with carry.\n\n" +
                "UNIT V\n" +
                "8255 Programmable peripheral interface, interfacing keyboard and seven segment display, 8254 (8253) programmable interval timer, 8259A programmable interrupt controller, Direct Memory Access and 8237 DMA controller. Introduction to 8086 microprocessor: Architecture of 8086 (Pin diagram, Functional block diagram, Register organization)";
        cricket.add(micropr);

        List<String> football1 = new ArrayList<String>();
        String os ="Unit – I Introduction : \n" +
                "Operating system and functions, Classification of Operating systems- Batch, Interactive, Time sharing, Real Time System, Multiprocessor Systems, Multiuser Systems, Multiprocess Systems, Multithreaded Systems, Operating System Structure- Layered structure, System Components, Operating System services, Re-entrant Kernels, Monolithic and Microkernel Systems.\n\n" +
                "Unit – II Concurrent Processes: \n" +
                "Process Concept, Principle of Concurrency, Producer / Consumer Problem, Mutual Exclusion, Critical Section Problem, Dekker’s solution, Peterson’s solution,Semaphores, Test and Set operation; Classical Problem in Concurrency- Dining Philosopher Problem, Sleeping Barber Problem; Inter Process Communication models and Schemes,Process generation.\n\n" +
                "Unit – III CPU Scheduling: \n" +
                "Scheduling Concepts, Performance Criteria, Process States, Process Transition Diagram, Schedulers, Process Control Block (PCB), Process address space, Process identification information, Threads and their management, Scheduling Algorithms, Multiprocessor Scheduling. Deadlock: System model, Deadlock characterization, Prevention, Avoidance and detection, Recovery from deadlock.\n\n" +
                "Unit – IV Memory Management: \n" +
                "Basic bare machine, Resident monitor, Multiprogramming with fixed partitions, Multiprogramming with variable partitions, Protection schemes, Paging, Segmentation, Paged segmentation, Virtual memory concepts, Demand paging, Performance of demand paging, Page replacement algorithms, Thrashing, Cache memory organization, Locality of reference.\n\n" +
                "Unit – V\n" +
                "I/O Management and Disk Scheduling: I/O devices, and I/O subsystems, I/O buffering, Disk storage and disk scheduling, RAID. File System: File concept, File organization and access mechanism, File directories, and File sharing, File system implementation issues, File system protection and security. ";

        football.add(os);

        List<String> basketball1 = new ArrayList<String>();
        String se= "Unit-I: Introduction\n" +
                "Introduction to Software Engineering, Software Components, Software Characteristics, Software Crisis, Software Engineering Processes, Similarity and Differences from Conventional Engineering Processes, Software Quality Attributes. Software Development Life Cycle (SDLC) Models: Water Fall Model, Prototype Model, Spiral Model, Evolutionary Development Models, Iterative Enhancement Models.\n\n" +
                "Unit-II: Software Requirement Specifications (SRS)\n" +
                "Requirement Engineering Process: Elicitation, Analysis, Documentation, Review and Management of User Needs, Feasibility Study, Information Modelling, Data Flow Diagrams, Entity Relationship Diagrams, Decision Tables, SRS Document, IEEE Standards for SRS. Software Quality Assurance (SQA): Verification and Validation, SQA Plans, Software Quality Frameworks, ISO 9000 Models, SEI-CMM Model.\n\n" +
                "Unit-III: Software Design\n" +
                "Basic Concept of Software Design, Architectural Design, Low Level Design: Modularization, Design Structure Charts, Pseudo Codes, Flow Charts, Coupling and Cohesion Measures, Design Strategies: Function Oriented Design, Object Oriented Design, Top-Down and Bottom-Up Design. Software Measurement and Metrics: Various Size Oriented Measures: Halestead’s Software Science, Function Point (FP) Based Measures, Cyclomatic Complexity Measures: Control Flow Graphs.\n\n" +
                "Unit-IV: Software Testing\n" +
                "Testing Objectives, Unit Testing, Integration Testing, Acceptance Testing, Regression Testing, Testing for Functionality and Testing for Performance, Top-Down and Bottom-Up Testing Strategies: Test Drivers and Test Stubs, Structural Testing (White Box Testing), Functional Testing (Black Box Testing), Test Data Suit Preparation, Alpha and Beta Testing of Products. Static Testing Strategies: Formal Technical Reviews (Peer Reviews), Walk Through, Code Inspection, Compliance with Design and Coding Standards.\n\n" +
                "Unit-V: Software Maintenance and Software Project Management\n" +
                "Software as an Evolutionary Entity, Need for Maintenance, Categories of Maintenance: Preventive, Corrective and Perfective Maintenance, Cost of Maintenance, Software Re- Engineering, Reverse Engineering. Software Configuration Management Activities, Change Control Process, Software Version Control, An Overview of CASE Tools. Estimation of Various Parameters such as Cost, Efforts, Schedule/Duration, Constructive Cost Models (COCOMO), Resource Allocation Models, Software Risk Analysis and Management.";

        basketball.add(se);

        List<String>ball = new ArrayList<String>();
        String toaf = "Unit – I Introduction;\n" +
                " Alphabets, Strings and Languages; Automata and Grammars, Deterministic finite Automata (DFA)-Formal Definition, Simplified notation: State transition graph, Transition table, Language of DFA, Nondeterministic finite Automata (NFA), NFA with epsilon transition, Language of NFA, Equivalence of NFA and DFA, Minimization of Finite Automata, Distinguishing one string from other, Myhill-Nerode Theorem\n\n" +
                "Unit – II\n" +
                "Regular expression (RE), Definition, Operators of regular expression and their precedence, Algebraic laws for Regular expressions, Kleen’s Theorem, Regular expression to FA, DFA to Regular expression, Arden Theorem, Non Regular Languages, Pumping Lemma for regular Languages . Application of Pumping Lemma, Closure properties of Regular Languages, Decision properties of Regular Languages, FA with output: Moore and Mealy machine, Equivalence of Moore and Mealy Machine, Applications and Limitation of FA.\n\n" +
                "Unit – III Context free grammar (CFG) and Context Free Languages (CFL):\n" +
                " Definition, Examples, Derivation, Derivation trees, Ambiguity in Grammar, Inherent ambiguity, Ambiguous to Unambiguous CFG, Useless symbols, Simplification of CFGs, Normal forms for CFGs: CNF and GNF, Closure proper ties of CFLs, Decision Properties of CFLs: Emptiness, Finiteness and Membership, Pumping lemma for CFLs.\n\n" +
                "Unit – IV Push Down Automata (PDA):\n" +
                " Description and definition, Instantaneous Description, Language of PDA, Acceptance by Final state, Acceptance by empty stack, Deterministic PDA, Equivalence of PDA and CFG, CFG to PDA and PDA to CFG, Two stack PDA\n\n" +
                "Unit – V Turing machines (TM):\n" +
                "Basic model, definition and representation, Instantaneous Description, Language acceptance by TM, Variants of Turing Machine, TM as Computerof Integer functions, Universal TM, Church’s Thesis, Recursive and recursively enumerable languages, Halting problem, Introduction to Undecidability, Undecidable problems about TMs. Post correspondence problem (PCP), Modified PCP, Introduction to recursive function theory";

        ball.add(toaf);
        List<String> lser = new ArrayList<String>();
        lser.add("Not Found");

        List<String>code = new ArrayList<String>();
        String codee = "Unit I\n" +
                "Review of probability theory, Definition of Information Measure and Entropy: Measure of information, Average information content of symbols in long independent sequences, Average information content of symbols in long dependent sequences. Mark-off statistical model for information source, Entropy and information rate of mark-off source, Mutual information. Asymptotic Properties of Entropy and Problem Solving in Entropy\n\n" +
                "Unit – II\n" +
                "Block Code and its Properties, Data compression, Kraft-Mcmillan Equality and Compact Codes, Encoding of the source output, Shannon’s encoding algorithm, Coding Strategies, Huffman Coding, Shannon-Fano-Elias Coding and Introduction to Arithmetic Coding.\n\n" +
                "Unit – III\n" +
                "Introduction to Information Channels, Communication Channels, Discrete communication channels, Continuous channels. Discrete memory less Channels, Mutual information, Channel Capacity, Channel coding theorem, Differential entropy and mutual information for continuous ensembles, Channel capacity Theorem.\n\n" +
                "Unit – IV\n" +
                "Introduction to Error Control Coding: Introduction, Types of errors, examples, Types of codes Linear Block Codes: Matrix description, Error detection and correction, Standard arrays and table look up for decoding\n\n" +
                "Unit – V\n" +
                "Binary Cycle Codes, Algebraic structures of cyclic codes, Encoding using an (n-k) bit shift register, Syndrome calculation. BCH codes. RS codes, Golay codes, Shortened cyclic codes, Burst error correcting codes. Burst and Random Error correcting codes. Convolution Codes, Time domain approach. Transform domain approach.";

        code.add(toaf);



        expandableListDetail.put("MATHEMATICS –III", cricket);
        expandableListDetail.put("COMPUTER ORGANIZATION AND ARCHITECTURE", football);
        expandableListDetail.put("DATA STRUCTURES", basketball);
        expandableListDetail.put("DISCRETE STRUCTURES & THEORY OF  LOGIC", dld1);
        expandableListDetail.put("DIGITAL LOGIC DESIGN", dld11);
        expandableListDetail.put("INTRODUCTION TO MICROPROCESSOR", cricket1);
        expandableListDetail.put("OPERATING SYSTEMS", football1);
        expandableListDetail.put("SOFTWARE ENGINEERING", basketball1);
        expandableListDetail.put("THEORY OF AUTOMATA AND FORMAL LANGUAGES", ball);
        expandableListDetail.put("LAser", lser);
        expandableListDetail.put("Information Theory and Coding",code);



        return expandableListDetail;
    }
}