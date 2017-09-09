package com.journaldev.expandablelistview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Year_1 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> physics = new ArrayList<String>();
        String physicss = "Unit – I: Relativistic Mechanics\n" +
                "Inertial & non-inertial frames, Galilean transformations, Michelson-Morley experiment, Einstein’s postulates, Lorentz transformation equations, Length contraction & Time dilation, Relativistic addition of velocities; Variation of mass with velocity, Mass energy equivalence, Concept of rest mass of photon.\n\n" +

                "Unit – II: Modern Physics \n" +
                "Black body radiation spectrum, Weins law and Rayleigh-Jeans law, Assumption of quantum theory of radiation, Planck’s law. Wave-particle duality, de-Broglie matter waves, Bohr’s quantization rule, Phase and Group velocities, Davisson-Germer experiment, Heisenberg uncertainty principle and its applications, Wave function and its significance, Schrödinger’s wave equation ( Time dependent and time independent) – particle in one dimensional potential box, Eigen values and Eigen function.\n\n" +

                "Unit – III: Wave Optics \n" +
                "Interference: Coherent sources, Interference in thin films (parallel and wedge shaped film) Newton’s rings and its applications Diffraction: Single, double and N- Slit Diffraction, Diffraction grating, Grating spectra dispersive power, Rayleigh’s criterion and resolving power of grating.\n\n" +

                "Unit – IV: Polarization and Laser \n" +
                "Polarization: Phenomena of double refraction, Nicol prism, Production and analysis of plane,circular and elliptical polarized light, Retardation Plate, Optical Activity, Fresnel’s theory, Specific rotation.Laser: Spontaneous and stimulated emission of radiation, population inversion, Einstein’s Coefficients, Concept of 3 and 4 level Laser, Construction and working of Ruby, He-Ne lasers and laser applications.\n\n" +

                "Unit – V: Fiber Optics and Holography \n" +
                "Fiber Optics: Fundamental ideas about optical fiber, Propagation mechanism, Acceptance angle and cone, Numerical aperture, Single and Multi Mode Fibers, Dispersion and Attenuation Holography: Basic Principle of Holography, Construction and reconstruction of Image on hologram and applications of holography. ";

        physics.add(physicss);

        List<String> maths = new ArrayList<String>();
        String maths1 = "Unit - 1: Differential Calculus – I\n" +
                "Successive Differentiation, Leibnitz’s theorem, Limit , Continuity and Differentiability of functions of several variables, Partial derivatives, Euler’s theorem for homogeneous functions, Total derivatives, Change of variables, Curve tracing: Cartesian and Polar coordinates.\n\n" +
                "Unit - 2: Differential Calculus - II\n" +
                "Taylor’s and Maclaurin’s Theorem, Expansion of function of several variables, Jacobian, Approximation of errors, Extrema of functions of several variables, Lagrange’s method of multipliers (Simple applications).\n\n" +
                "Unit - 3: Matrix Algebra\n" +
                "Types of Matrices, Inverse of a matrix by elementary transformations, Rank of a matrix (Echelon & Normal form), Linear dependence, Consistency of linear system of equations and their solution, Characteristic equation, Eigen values and Eigen vectors, Cayley-Hamilton Theorem, Diagonalization, Complex and Unitary Matrices and its properties\n\n" +
                "Unit - 4: Multiple Integrals\n" +
                "Double and triple integrals, Change of order of integration, Change of variables, Application of integration to lengths, Surface areas and Volumes – Cartesian and Polar coordinates. Beta and Gamma functions, Dirichlet’s integral and its applications.\n\n" +
                "Unit - 5: Vector Calculus\n" +
                "Point function, Gradient, Divergence and Curl of a vector and their physical interpretations, Vector identities, Tangent and Normal, Directional derivatives. Line, Surface and Volume integrals, Applications of Green’s, Stoke’s and Gauss divergence theorems (without proof). ";

        maths.add(maths1);

        List<String> cham = new ArrayList<String>();
        String cham1 = "Unit-1\n" +
                " Molecular orbital theory and its applications to homo-nuclear diatomic molecules. Band theory of solids. Liquid crystals and its applications Point defects in Solids. Structure and applications of Graphite and Fullerenes. Concepts of nano-materials and its applications\n\n" +
                "Unit-2 Polymers:\n" +
                " Basic concepts of polymer- blends and composites. Conducting and biodegradablepolymers. Preparations and applications of some industrially important polymers(Buna N, Buna S, Neoprene, Nylon 6, Nylon 6,6 , Terylene). General methods of synthesis of organometallic compound (Grignard Reagent) and their applications in polymerization.\n\n" +
                "Unit-3 Electrochemistry:\n" +
                " Galvanic cell, electrode potential, Lead storage battery. Corrosion, causes and its prevention. Setting and hardening of cement, applications of cement. Plaster of paris. Lubricants- Classification,mechanism and applications..\n\n" +
                "Unit-4 Hardness of water.\n" +
                " Disadvantage of hard water. Boiler troubles,Techniques for water softening; Lime-soda, Zeolite, Ion exchange resin,Reverse osmosis. Phase Rule and its application to water system.\n\n" +
                "Unit-5 Fuels\n" +
                " Classification of fuels. Analysis of Coal. Determination of Calorific values (bomb calorimeter & Dulong’s method). Biogas.Elementary ideas and simple applications of UV, Visible, IR and H1NMR spectral Techniques";
        cham.add(cham1);

        List<String> electronics = new ArrayList<String>();
        String electronics1 = "Unit I: PN junction diode: \n" +
                " Introduction of Semiconductor Materials Semiconductor Diode: Depletion layer, V-I characteristics, ideal and practical, diode resistance, capacitance, Diode Equivalent Circuits, Transition and Diffusion Capacitance,Zener Diodes breakdown mechanism (Zener and avalanche) Diode Application: Series , Parallel and Series, Parallel Diode Configuration, Half and Full Wave rectification, Clippers, Clampers, Zener diode as shunt regulator, Voltage-Multiplier Circuits Special Purpose two terminal Devices :Light-Emitting Diodes, Varactor (Varicap) Diodes, Tunnel Diodes, Liquid-Crystal Displays.\n\n" +
                "Unit II Bipolar Junction Transistors and Field Effect Transistor:\n" +
                "Bipolar Junction Transistor: Transistor Construction, Operation, Amplification action. Common Base, Common Emitter, Common Collector Configuration DC Biasing BJTs: Operating Point, Fixed-Bias, Emitter Bias, Voltage-Divider Bias Configuration.Collector Feedback, Emitter-Follower Configuration. Bias Stabilization. CE, CB, CC amplifiers and AC analysis of single stage CE amplifier (re Model ). Field Effect Transistor: Construction and Characteristic of JFETs. AC analysis of CS amplifier, MOSFET (Depletion and Enhancement)Type, Transfer Characteristic,\n\n" +
                "Unit III Operational Amplifiers :\n" +
                " Introduction and Block diagram of Op Amp, Ideal Practical characteristics of Op Amp, Differential amplifier circuits, Practical OpAmp Circuits (Inverting Amplifier, Non inverting Amplifier, Unity Gain Amplifier, Summing Amplifier, Integrator, Differentiator). OPAMP Parameters: Input offset voltage, Output offset voltage, Input biased current, Input offset current Differential and Common-Mode Operation\n\n" +
                "Unit IV Electronic Instrumentation and Measurements: Digital Voltmeter \n" +
                "RAMP Techniques Digital Multimeters: Introduction Oscilloscope: Introduction,Basic Principle, CRT , Block Diagram of Oscilloscope, Simple CRO, Measurement of voltage, current phase and frequency using CRO, Introduction of Digital Storage Oscilloscope and Comparison of DSO with Analog Oscilloscope.\n\n" +
                "Unit V Fundamentals of Communication Engineering: Elements of a Communication\n" +
                "System, Need of Modulation, Electromagnetic spectrum and typical applications.Basics of Signal Representation and Analysis, Introduction of various analog modulation techniques, Fundamentals of amplitude modulation, Modulation and Demodulation Techniques of AM";

        electronics.add(electronics1);

        List<String> mech = new ArrayList<String>();
        String mech1= "UNIT-I:Force System: \n" +
                "Force, Parallelogram Law, Lami’s theorem, Principle of Transmissibility of forces. Moment of a force, Couple, Varignon’s theorem, Resolution of a force into a force and a couple. Resultant of coplanar force system. Equilibrium of coplanar force system, Free body diagrams, Determination of reactions. Concept of Centre of Gravity and Centroidand Area Moment of Inertia, Perpendicular axis theorem and Parallel axis theorem\n\n" +
                "UNIT-II:Plane Truss:\n" +
                " Perfect and imperfect truss, Assumptions and Analysis of Plane Truss by Method of joints and Method of section. Beams: Types of beams, Statically Determinate Beams, Shear force and bending moment in beams, Shear force and bending moment diagrams, Relationships between load, shear and bending moment.\n\n" +
                "UNIT-III:Simple stress and strain:\n" +
                " Normal and shear stresses. One Dimensional Loading; members of varying cross section, bars in series. Tensile Test diagram for ductile and brittle materials, Elastic constants, Strain energy. Bending (Flexural) Stresses: theory of pure bending, neutral surface and neutral axis, stressesin beams of different cross sections. Engineering Materials: Importance of engineering materials, classification, mechanical properties and applications of Ferrous, Nonferrous and composite materials.\n\n" +
                "UNI-IV:Basic Concepts and Definitions of Thermodynamics:\n" +
                " Introduction and definition of thermodynamics, Microscopic and Macroscopic approaches, System, surrounding and universe, Concept of continuum, Thermodynamic equilibrium, Thermodynamic properties, path, process and cycle, Quasi static process, Energy and its forms, Work and heat. Thermodynamic definition of work.Zeroth law of thermodynamics: Temperature and its’ measurement.First law of thermodynamics: First law of thermodynamics, Internal energy and enthalpy. First law analysis for non-flow processes. Non-flow work Steady flow energy equation; Boilers, Condensers, Turbine, Throttling process, Pumps etc.\n\n" +
                "UNIT-V: Second law:\n" +
                " Thermal reservoir, Kelvin Planck statement, Heat engines, Efficiency; Clausius’ statement Heat pump, refrigerator, Coefficient of Performance. Carnot cycle, Carnot theorem and it’s corollaries.Clausius inequality, Concept of Entropy. Properties of pure substances: P-v, T-s and h-s diagram, dryness fraction and steam tables Rankine Cycle. Internal Combustion Engines: Classification of I.C. Engines and their parts, working principle and comparison between 2 Stroke and 4 stroke engine , difference between SI and CI engines. Pv and T-s diagramsof Otto and Diesel cycles, comparison of efficiency.\n\n";

        mech.add(mech1);

        List<String> electrical = new ArrayList<String>();
        String electrical1 = "Unit- I : Electrical Circuit Analysis:\n" +
                "Introduction, Circuit Concepts: Concepts of network, Active and passive elements, Voltage and current sources, Concept of linearity and linear network, Unilateral and bilateral elements, Source transformation, Kirchhoff’s laws, Loop and nodal methods of analysis, Star-delta transformation,AC fundamentals: Sinusoidal, square and triangular waveforms – Average and effective values, Form and peak factors, Concept of phasors, phasor representation of sinusoidally varying voltage and current.\n\n" +
                "Unit II: Steady- State Analysis of Single Phase AC Circuits:\n" +
                "Analysis of series and parallel RLCCircuits, Concept of Resonance in series & parallel circuits,bandwidth and quality factor; Apparent, active & reactive powers, Power factor, Concept of power factor improvement and its improvement (Simple numerical problems) Network theorems (AC & DC with independent sources): Superposition theorem, Thevenin’s theorem, Norton’s theorem, Maximum Power Transfer theorem (Simple numerical problems)\n\n" +
                "Unit-III : Three Phase AC Circuits:\n" +
                "Three phase system-its necessity and advantages, Star and delta connections, Balanced supply and balanced load, Line and phase voltage current relations, Three-phase power and itsmeasurement (simple numerical problems). Measuring Instruments: Types of instruments, Construction and working principles of PMMCand moving iron type voltmeters & ammeters, Single phase dynamometer wattmeter, Use ofshunts and multipliers (Simple numerical problems on shunts and multipliers)\n\n" +
                "Unit IV: Magnetic Circuit:\n" +
                "Magnetic circuit concepts, analogy between electric & magnetic circuits, B-H curve, Hysteresis and eddy current losses, Magnetic circuit calculations (Series & Parallel). Single Phase Transformer: Principle of operation, Construction, EMF equation, Equivalent circuit, Power losses, Efficiency (Simple numerical problems), Introduction to auto transformer.\n\n" +
                "Unit-V: Electrical Machines:\n" +
                "DC machines:Principle & Construction, Types, EMF equation of generator and torque equationof motor, applications of DC motors (simple numerical problems)Three Phase Induction Motor:Principle & Construction, Types, Slip-torque characteristics,Applications (Numerical problems related to slip only)Single Phase Induction motor: Principle of operation and introduction to methods of starting,applications.Three Phase Synchronous Machines: Principle of operation of alternator and synchronous motor and their applications.";

        electrical.add(electrical1);

        List<String> comp = new ArrayList<String>();
        String comp1 = "Unit-1:Basics of Computer:\n" +
                " Introduction to digital computer, basic operations of computer, functional components of computer, Classification of computers. Introduction to operating system: [DOS, Windows, Linux and Android] purpose, function, services and types. Number system: Binary, octal and hexadecimal number systems, their mutual conversions, Binary arithmetic. Basics of programming: Approaches to Problem Solving, Concept of algorithm and flow charts, Types of computer languages:- Machine Language, Assembly Language and High Level Language, Concept of Assembler, Compiler, Loader and Linker.\n\n" +
                "Unit-2:Standard I/O in “C”\n" +
                "Fundamental data types- Character type, integer, short, long, unsigned,single and double floating point, Storage classes- automatic, register, static and external,Operators and expression using numeric and relational operators, mixed operands, type conversion, logical operators, bit operations, assignment operator, operator precedence and associatively.Fundamentals of C programming: Structure of C program, writing and executing the first Cprogram, Components of C language. Standard I/O in C.\n\n" +
                "Unit-3:Conditional program execution:\n" +
                " Applying if and switch statements, nesting if and else, use of break and default with switch, program loops and iterations: use of while, do while and for loops,multiple loop variables, use of break and continue statements.Functions: Introduction, types of functions, functions with array, passing values to functions,recursive functions.\n\n" +
                "Unit-4:Arrays: \n" +
                " Array notation and representation, manipulating array elements, using multi dimensional arrays.Structure, union, enumerated data types\n\n" +
                "Unit-5:Pointers:\n" +
                " Introduction, declaration, applications File handling, standard C preprocessors,defining and calling macros, conditional compilation, passing values to the compiler.\n";

        comp.add(comp1);

        List<String> pc = new ArrayList<String>();
        String pc1 = "Unit-1:Fundamentals of Communications:\n" +
                "Technical Communication: features: Distinction between General And Technical Communication; Language as a tool of communications; Levels of communication: Interpersonal, Organizational, Mass communication; The flow of communication: Downward, Upward, Lateral/Horizontal (Peer group) : Importance of technical communication; Barriers to Communication.\n\n" +
                "Unit-II:Written Communication:\n" +
                "Words and Phrases: Word formation, Synonyms and Antonyms Homophones; Select vocabulary of about 500-1000 New words;correct Usage: all Parts of Speech; Modals; Concord; Articles;Infinitives; Transformation of sentences; Requisites f SentencebConstruction: Paragraph Development: Techniques and MethodsInductive,Deductive, Spatial , Linear, Chronological etc.\n\n" +
                "Unit-III:Business Communication:\n" +
                "Principles, Sales & Credit letters; Claim and Adjustment Letters; Job Application and Resumes. Reports: Types; Significance; Structure,Style & Writing of Reports.Technical Proposal; Parts; Types; Writing of Proposal; Significance;Negotiation skills.\n\n" +
                "Unit-IV:Presentation Strategies and Soft Skill:\n" +
                "Nuances and Modes of Delivery; Body Language; Dimensions of Speech: Syllable; Accent; Pitch; Rhythm; Intonation; Paralinguistic features of voice; Interpersonal communication: Definition; Types; Team work; Attitude; Way to improve Attitude Listening Skills :Types; Methods for improving Listening Skills.\n\n" +
                "Unit –V:Value- Based Text Readings:\n" +
                "Following essays from the prescribed text book with emphasis onMechanics of writing.\n" +
                "(i) Humanistic and Scientific Approaches to Human Activity by Moody E. Prior\n" +
                "(ii) The Language of Literature and Science by A. Huxley\n" +
                "(iii) Man and Nature by J. Bronowski\n" +
                "(iv) Science and Survival by Barry Commoner\n" +
                "(v) The Mother of the Sciences by A.J. Bahm";

        pc.add(pc1);

        List<String> m3 = new ArrayList<String>();
        String m31= "Unit - 1: Ordinary Differential Equations\n" +
                "Linear differential equations of nth order with constant coefficients, Complementary function and Particular integral, Simultaneous linear differential equations, Solution of second order differential equations by changing dependent & independent variables, Method of variation of parameters, Applications to engineering problems (without derivation).\n\n" +
                "Unit - 2: Series Solution and Special Functions\n" +
                "Series solution of second order ordinary differential equations with variable coefficient (Frobenius method), Bessel and Legendre equations and their series solutions, Properties of Bessel function and Legendre polynomials.\n\n" +
                "Unit - 3: Laplace Transform\n" +
                "Laplace transform, Existence theorem, Laplace transforms of derivatives and integrals, Initial and final value theorems, Unit step function, Dirac- delta function, Laplace transform of periodic function, Inverse Laplace transform, Convolution theorem, Application to solve simple linear and simultaneous differential equations.\n\n" +
                "Unit - 4: Fourier Series and Partial Differential Equations\n" +
                "Periodic functions, Dirichlet’s Conditions, Fourier series of arbitrary periods, Euler’s Formulae, Even and odd functions, Half range sine and cosine series, Gibbs Phenomena. Solution of first order Lagrange’s linear partial differential equations, Second order linear partial differential equations with constant coefficients.\n\n" +
                "Unit - 5: Applications of Partial Differential Equations\n" +
                "Classification of second order partial differential equations, Method of separation of variables for solving partial differential equations, Solution of one and two dimensional wave and heat conduction equations, Laplace equation in two dimension, Equation of transmission lines. ";

        m3.add(m31);

        List<String> phy3 = new ArrayList<String>();
        String phy31 = "Unit – I: Crystal Structures and X-ray Diffraction \n" +
                "Space lattice, basis, Unit cell, Lattice parameter, Seven crystal systems and Fourteen Bravais lattices, Co-ordination number, Atomic radius and Packing factor of different cubic structures, Crystal structure of NaCl and diamond, Lattice planes and Miller Indices, Diffraction of X-rays by crystal, Laue’s experiment, Bragg’s Law, Bragg’s spectrometer. Compton Effect.\n\n" +
                "Unit – II: Dielectric and Magnetic Properties of Materials\n" +
                "Dielectric Properties: Dielectric constant and Polarization of dielectric materials, Relation between E, D and P, Types of Polarization (Polarizability). Equation of internal fields in liquid and solid (One- Dimensional), Claussius-Mossotti equation, Frequency dependence of dielectric constant, Dielectric Losses, Important applications of dielectric material, Ferroelectricity, Piezoelectricity. Magnetic Properties: Magnetization, Origin of magnetic moment, Dia, para and ferro magnetism, Langevin’s theory for diamagnetic material, Phenomena of hysteresis and its applications.\n\n" +
                "Unit – III: Electromagnetic Theory \n" +
                "Equation of continuity, Maxwell’s Equations (Integral and Differential Forms) and its derivations, Displacement Current, Poynting vector and Poynting theorem, EM - Wave equation and its propagation characteristics in free space, non-conducting and conducting media, energy density of electromagnetic wave, Skin depth.\n\n" +
                "Unit – IV: Band Theory of Solids\n" +
                "Free electron Theory, Formation of bands in Solids, Classification of solids on band theory, Density of states, Fermi-Dirac distribution, Concept of effective mass, Charge carrier density (electrons and holes), Conductivity of semiconductors, carrier concentrations Fermi energy, Position of Fermi level in intrinsic and in extrinsic semiconductors. Temperature dependence of conductivity in semiconductors.\n\n" +
                "Unit – V: Physics of some technologically important Materials\n" +
                "Superconductors: Temperature dependence of resistivity in superconducting materials, Effect of magnetic field (Meissner effect), Temperature dependence of critical field, London equations, Josephson theory, persistent currents, Type I and Type II superconductors, BCS theory (Qualitative), High temperature superconductors and Applications of Super-conductors. Nano-Materials: Basic principle of nanoscience and technology, structure, properties and uses of Fullerene, Carbon nanotubes Single and double walled nanotubes, synthesis of nanotubes, Properties and Applications of nanotubes";

        phy3.add(phy31);


        expandableListDetail.put("ENGINEERING PHYSICS-I",physics);
        expandableListDetail.put("ENGINEERING MATHMATICS-I ",maths);
        expandableListDetail.put("ENGINEERING CHEMISTRY ",cham);
        expandableListDetail.put(" ELEMENTS OF MECHANICAL ENGINEERING",mech);
        expandableListDetail.put("BASIC ELECTRICAL ENGINEERING",electrical);
        expandableListDetail.put("COMPUTER SYSTEM AND PROGRAMING IN C",comp);
        expandableListDetail.put("ENGINEERING MATHMATICS-II",m3);
        expandableListDetail.put("ENGINEERING PHYSICS-II",phy3);
        expandableListDetail.put("Basic Electronics",electronics);
        expandableListDetail.put("Professional Communication",pc);


        return expandableListDetail;
    }
}