package com.journaldev.expandablelistview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Chandan on 8/13/2017.
 */

public class Me_2 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> ms1 = new ArrayList<String>();
        String ms= "UNIT-I Introduction: \n" +
                "Importance of materials, historical perspective, Future aspects of engg.materials. Crystal Structure: brief on BCC, FCC and HCP Structures, coordination number and atomic  packing factors. Bravais lattices, Miller indices, crystal imperfections-point line and surface imperfections. Atomic Diffusion: Phenomenon, Ficks laws of diffusion, factors affecting diffusion. Ferrous and non- ferrous materials: Properties, Composition and uses of Grey cast iron, malleable iron, SG iron and steel, copper alloys-brasses and bronzes, Aluminium alloys. Introduction to BIS & ASTM codes and practice on material and testing.\n\n" +
                "UNIT-II Mechanical Behaviour:\n" +
                "Stress-strain diagram showing ductile and brittle behaviour of materials, mechanical properties in plastic range, yield strength off set yield strength, ductility, ultimate tensile strength, toughness, Plastic deformation of single crystal by slip and twinning, Hardness Tests. Fracture Creep Fatigue: Fracture: Type I, Type II and Type III. Creep: Description of the phenomenon with examples. Three stages of creep, creep properties, stress relaxation. Fatigue: Types of fatigue loading with examples, Mechanism of fatigue, fatigue properties, fatigue testing and S-N diagram.\n\n" +
                "UNIT-III Solidification:\n" +
                "Mechanism of solidification, Homogenous and Heterogeneous nucleation, crystal growth, cast metal structures. Phase DiagramI: Solid solutions Hume Rothary rule, substitutional and interstitial solid solutions, intermediatephases, Gibbs phase rule. Phase Diagram: Construction of equilibrium diagrams involving complete and partial solubility, lever rule. Iron carbon equilibrium diagram description of phases, solidification osteels and cast irons, invariant reactions.\n\n" +
                "UNIT-IV Heat Treating of Metals\n" +
                "TTT curves, continuous cooling curves, annealing and its types. Normalizing, hardening, tempering, mastempering, austempering, hardenability, surface hardening methods like carburizing, cyaniding, nitriding, flame hardening and induction hardening, age hardening of aluminium-copper alloys. Comparativestudyof microstructureof various Ferrous,nonferrous metals andalloys.\n\n" +
                "UNIT-V\n" +
                "Composite materials: Definition, classification, types of matrix materials & reinforcements, fundamentals of production of FRP's and MMC's advantages and application of composites.Ceramics: Structure types and properties and applications of ceramics. Mechanical/ Electrical behavior and processing of Ceramics. Plastics: Various types of polymers/ plastics and its applications. Mechanical behaviour and processing of plastics, Future of plastics. Introduction to Smart materials & Nano-materials and their potential applications";

        ms1.add(ms);

        List<String> fm1 = new ArrayList<String>();
        String fm=  "Unit - I Fluid and continuum,\n" +
                "Physical properties of fluids, Rheology of fluids.Pressure-density-height relationship, manometers, pressure transducers, pressure on plane and curved surfaces, centre of pressure, buoyancy, stability of immersed and floating bodies, fluid masses subjected to linear acceleration and uniform rotation about an axis.\n\n" +
                "Unit - II Types of fluid flows:\n" +
                "Continuum & free molecular flows. Steady and unsteady, uniform and non- uniform, laminar and turbulent flows, rotational and irrotational flows, compressible and incompressible flows, subsonic, sonic and supersonic flows, sub-critical, critical and supercritical flows, one, two and three dimensional flows, streamlines, continuity equation for 3D and 1D flows, circulation, stream function and velocity potential. Dimensional analysis, Buckingham’s Pi theorem, important dimensionless numbers and their significance,\n\n" +
                "Unit - III Potential Flow:\n" +
                "source, sink, doublet and half-body. Equation of motion along a streamline and its integration, Bernoulli’s equation and its applications- Pitot tube, orifice meter, venturi meter and bend meter, Hot-wire anemometer and LDA, notches and weirs, momentum equation and its application to pipe bends. Similarity Laws: geometric, kinematics and dynamic similarity, undistorted and distorted model studies.\n\n" +
                "Unit - IV\n" +
                "Equation of motion for laminar flow through pipes, Stokes’ law, transition from laminar to turbulent flow, turbulent flow, types of turbulent flow, isotropic, homogenous turbulence, scale and intensity of turbulence, measurement of turbulence, eddy viscosity, mixing length concept and velocity distribution in turbulent flow over smooth and rough surfaces, resistance to flow, minor losses, pipe in series and parallel, power transmission through a pipe, siphon, water hammer, three reservoir problems and pipe networks.\n\n" +
                "Unit - V\n" +
                "Boundary layer thickness, boundary layer over a flat plate, laminar boundary layer, application of momentum equation, turbulent boundary layer, laminar sub-layer, separation and its control, Drag and lift, drag on a sphere, a two dimensional cylinder, and an aerofoil, Magnus effect. Introduction to compressible flow";

        fm1.add(fm);

        List<String> thermo = new ArrayList<String>();
        String thermo1="UNIT–I Review of Fundamental Concepts and Definitions: \n" +
                "Introduction- Basic Concepts: System, Control Volume, Surrounding, Boundaries, Universe, Types of Systems, Macroscopic and Microscopic viewpoints, Concept of Continuum, Thermodynamic Equilibrium, State,Property, Process, Exact & Inexact Differentials, Cycle Reversibility Quasi – static Process,Irreversible Process, Causes of Irreversibility Energy and its forms, Work and heat (sign convention), Gas laws, Ideal gas, Real gas, Law of corresponding states, Dalton’s law, Amagat’s law, Property of mixture of gases. Zeroth law of thermodynamics: Concept of Temperature and its’ measurement, Temperature scales. First law of thermodynamics: Thermodynamic definition of work, Displacement work and flow work, Displacement work for various non flow processes, Joules’ experiment, First law analysis for closed system (non flow processes), Internal energy and enthalpy. Limitations of first law of thermodynamics, PMM-I. Steady flow systems and their analysis, Steady flow energy equation, Boilers, Condensers, Turbine, Throttling process, Pumps etc. Analysis of unsteady processes such as filling and evacuation of vessels with and without heat transfer.\n\n" +
                "UNIT–II Second law of thermodynamics: \n" +
                "Thermal reservoirs, Energy conversion, Heat engines, Efficiency, Reversed heat engine, Heat pump, Refrigerator, Coefficient of Performance, Kelvin Planck and Clausius statement of second law of thermodynamics, Equivalence of the two statements. Reversible and irreversible processes, Carnot cycle and Carnot engine, Carnot theorem and it’s corollaries, Thermodynamic Temperature Scale, PMM-II. Entropy : Clausius inequality, Concept of Entropy, Entropy change of pure substance in different thermodynamic processes, Tds equation, Principle of entropy increase, T-S diagram, Statement of the third law of thermodynamics.\n\n" +
                "UNIT–III Availability and Irreversibility: \n" +
                "Available and unavailable energy, Availability andIrreversibility, Second law efficiency, Helmholtz & Gibb’s function.Thermodynamic relations: Conditions for exact differentials. Maxwell relations, Clapeyron equation, Joule-Thompson coefficient and Inversion curve. Coefficient of volume expansion, Adiabatic and Isothermal compressibility.\n\n" +
                "UNIT–IV Properties of steam and Rankine cycle:\n" +
                "Pure substance, Property of Pure Substance (steam), Triple point, Critical point, Saturation states, Sub-cooled liquid state, Superheated vapour state, Phase transformation process of water, Graphical representation of pressure, volume and temperature, P-T, P-V and P-h diagrams, T-S and H-S diagrams, use of property diagram, Steam-Tables &Mollier chart, Dryness factor and it’s measurement, processes involving steam in closed and open systems. Simple Rankine cycle.Air-water vapour mixture and Psychrometry: Psychometric terms and their definitions,Psychometric chart, Different Psychometric processes and their representation on Psychometric chart.\n\n" +
                "UNIT–V Refrigeration Cycles:\n" +
                "Reversed Carnot Cycle for gas and vapour. Refrigeration capacity, unit of refrigeration.Air Refrigeration cycles; Reversed Brayton Cycle and Bell Coleman Cycle. Vapour compression refrigeration cycle; simple saturated cycle and actual vapour compression refrigeration cycle. Analysis of cycles, effect of superheating, sub-cooling and change in evaporator and condenser pressure on performance of vapour compression refrigeration cycle. Refrigerants; their classification and desirable properties. Vapour absorption refrigeration system.";

        thermo.add(thermo1);
        List<String> mos1 = new ArrayList<String>();
        String mos = "UNIT-I Compound stress and strains: \n" +
                "Introduction, normal stress and strain, shear stress and strain, stresses on inclines sections, strain energy, impact loads and stresses, state of plane stress, principal stress and strain, maximum shear stress, Mohr’s stress circle, three dimensional state of stress & strain, equilibrium equations, generalized Hook’s law, theories of failure. Thermal Stresses.\n\n" +
                "UNIT –II Stresses in Beams:\n" +
                "Pure Bending, normal stresses in beams,shear stresses in beams due to transverse and axial loads, composite beams.\n" +
                "2 Deflection of Beams: Equation of elastic curve, cantilever and simply supported beams, Macaulay’s method, area moment method, fixed and continuous beams Torsion: Torsion, combined bending & torsion of solid & hollow shafts, torsion of thin walled tubes\n\n" +
                "UNIT-III Helical and Leaf Springs: \n" +
                "Deflection of springs by energy method, helical springs under axial load and under axial twist (respectively for circular and square cross sections) axial load and twisting moment acting simultaneously both for open and closed coiled springs, laminated springs.Columns and Struts: Buckling and stability, slenderness ratio, combined bending and direct stress, middle third and middle quarter rules, struts with different end conditions, Euler’s theory for pin ended columns, effect of end conditions on column buckling, Ranking Gordonformulae, examples of columns in mechanical equipments and machines.\n\n" +
                "UNIT-IV Thin cylinders & spheres:\n" +
                "Introduction, difference between thin walled and thick walled pressure vessels, Thin walled spheres and cylinders, hoop and axial stresses and strain, volumetric strain.Thick cylinders: Radial, axial and circumferential stresses in thick cylinders subjected to internal or external pressures, compound cylinders, stresses in rotating shaft and cylinders, stresses due to interference fits.\n\n" +
                "UNIT-V Curved Beams: \n" +
                "Bending of beams with large initial curvature, position of neutral axis for rectangular, trapezoidal and circular cross sections, stress in crane hooks, stress in circular rings subjected to tension or compression.";

        mos1.add(mos);
        List<String> mt3 = new ArrayList<String>();
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

        mt3.add(m3);
        List<String> emc = new ArrayList<String>();
        String emc1="UNIT-I Single phase Transformer:\n" +
                "Efficiency Voltage regulation, O.C.& S.C. Tests.Three Phase Transformer: Three phase transformer connections, 3-phase to 2-phase or 6-phase connections and their applications.Auto Transformer: Volt- Amp relations, efficiency, advantages & disadvantages,applications.D.C. Motors: Concept of starting, speed control, losses and efficiency.\n\n" +
                "UNIT-II Three phase Induction Motor:\n" +
                "Construction, equivalent circuit, torque equation and torqueslip characteristics, speed control.Alternator: Construction, e.m.f. equation, Voltage regulation and its determination by synchronous impedance method.Synchronous Motor: Starting, effect of excitation on line current (V-curves), synchronous condenser. Servo Motor: Two phase a.c. servo motor & its application.\n\n" +
                "UNIT-III Modeling of Mechanical System:\n" +
                "linear mechanical elements, force-voltage and force current analogy, electrical analog of simple mechanical systems; concept of transfer function & its determination for simple systems.Control System: Open loop & closed loop controls, servo mechanisms; concept of various types of system.Signals: Unit step, unit ramp, unit impulse and periodic signals with their mathematical representation and characteristics.\n\n" +
                "UNIT-IV Time Response Analysis:\n" +
                "Time response of a standard second order system and response specifications, steady state errors and error constants. Stability: Concept and types of stability, Routh Hurwitz Criterion and its application for determination of stability, limitations; Polar plot, Nyquist stability Criterion and assessmentof stability.\n\n" +
                "UNIT-V Root Locus Techniques: \n" +
                "Concept of root locus, construction of root loci. Frequency Response Analysis: Correlation between time and frequency responses of a second order system; Bode plot, gain margin and phase margin and their determination from Bode and Polar plots.";

        emc.add(emc1);
        List<String> mam = new ArrayList<String>();
        String mam1="UNIT-I Mechanical Measurements: \n" +
                "Introduction to measurement and measuring instruments. General concept–Generalized measurement system and its elements-Unit sand standardsmeasuring instruments: sensitivity, stability, range, accuracy and precision-static and dynamic response- repeatability-systematic, Source of error, statistical analysis of error and random errors- correction, calibration. Dimensional and geometric tolerance Sensors and Transducers: Types of sensors, types of transducers and their characteristics.\n\n" +
                "UNIT-II Time Related Measurements:\n" +
                "Stroboscope, frequency measurement by direct comparison. Measurement of displacement Measurement of Pressure: Gravitational, directing acting, elastic and indirect type pressure transducers. Measurement of verylow pressures (high vacuum). Strain Measurement: Types of strain gauges andtheir working, straingauge circuits, temperature compensation. Strain rosettes, calibration.\n\n" +
                "UNIT-III Flow Measurement: \n" +
                "Hot Wire Anemometry, Laser Doppler Velocimetry, Rotamete Temperature Measurement: Thermometers, bimetallicthermocouples, thermistors and pyrometers. Measurements of Force, Torque: Different types of load cells, elastic transducers, pneumatic & hydraulic systems. Seismic instrumentsMeasurements of Acceleration, and Vibration: Accelerometers vibration pickups and decibel meters, vibrometers.\n\n" +
                "UNIT-IV Coordinate measuring machine (CMM):\n" +
                "Need, constructional features and types, Metrology and Inspection: Standards of linear measurement, line and end standards. Interchange ability and standardization. Linear and angular measurements devices and systems Comparators: Sigma, Johansson’s Microkrator. Limit gauges classification, Taylor’s Principle of Gauge Design.\n\n" +
                "UNIT-V Limits,Fits &Tolerance and Surface roughness: \n" +
                "Introduction to Limits, Fits, Tolerances and IS standards, Limit-gauges, and surface-roughness. Measurement of geometric forms like straightness, flatness, roundness. Tool makers microscope, profile projector, autocollimator. Interferometry: principle and useof interferometry, optical flat. Measurement of screw threads andgears.Surface texture: quantitative evaluation of surface roughness and its measurement.";


        mam.add(mam1);
        List<String> mst1 = new ArrayList<String>();
        String mst11="UNIT-I Introduction: \n" +
                "Importance of manufacturing. Economic & technological considerations in manufacturing. Classification of manufacturing processes. Materials & manufacturing processes for common items.Metal Forming Processes:Elastic & plastic deformation, yield criteria (Mises’ and Tresca’s). Hot working versus cold working.Analysis (equilibrium equation method) of Forging process for load estimation with sliding friction, sticking friction and mixed condition for slab and disc. Work required for forging,Hand, Power, Drop Forging.\n\n" +
                "UNIT-II Metal Forming Processes (continued):\n" +
                "Analysis of Wire/strip drawing and maximum-reduction, Tube drawing, Extrusion and its application.Condition for Rolling force and power in rolling. Rolling mills & rolled-sections.Design, lubrication and defects in metal forming processes.\n\n" +
                "UNIT-III Sheet Metal working :\n" +
                "Presses and their classification, Die & punch assembly and press work methods and processes. Cutting/Punching mechanism, Blanking vs. Piercing. Compound vs. Progressive die. Flat-face vs Inclined-face punch and Load (capacity) needed.Analysis of forming process like cup/deep drawing. Bending & spring-back.\n\n" +
                "UNIT-IV Casting (Foundry)\n" +
                "Basic principle & survey of casting processes. Types of patterns and allowances. Types and properties of moulding sand, sand testing. Elements of mould and design considerations, Gating, Riser, Runnes, Core. Solidification of casting, Sand casting, defects & remedies and inspection.Cupola furnace.Die Casting, Centrifugal casting, Investment casting, Continuous casting, CO2 casting and Stir casting etc.\n\n" +
                "UNIT-V Unconventional Metal forming processes :\n" +
                "Unconventional metal forming or High Energy Rate Forming (HERF) processes such as explosive forming, electromagnetic, electro-hydraulic forming.\n" +
                "Powder Metallurgy :Introduction to Powder metallurgy manufacturing process.Application and, advantages.Jigs & Fixtures :Locating & Clamping devices & principles. Jigs and Fixtures and its applications.Manufacturing of Plastic components : Review of plastics, and its past, present & future uses. Injection moulding. Extrusion of plastic section. Welding of plastics. Future of plastic & its applications. Resins & Adhesives.";

        mst1.add(mst11);

        List<String> athermo = new ArrayList<String>();
        String athremo1 = "UNIT-I Gas power cycle: \n" +
                "Air Standard cycles: Carnot, Otto, Diesel, Dual and Stirling cycles, P-V and T-S diagrams, description, efficiencies and mean effective pressures, Comparison of Otto,Diesel and dual cycles.I.C. Engine: Testing of two stroke and four stroke SI and CI engines for performance Related numerical problems, heat balance, Motoring Method, Willian’s line method, swinging field dynamometer, Morse test.\n\n" +
                "3\n" +
                "UNIT-II Vapour Power cycles:\n" +
                "Rankine cycle, effect of pressure and temperature on Rankine cycle, Reheat cycle, Regenerative cycle, Feed water heaters, Binary vapour cycle, Combined cycles,Cogeneration.Fuels and Combustion: Combustion analysis, heating values, air requirement, Air/Fuel ratio, standard heat of reaction and effect of temperature on standard heat of reaction, heat of formation, Adiabatic flame temperature.\n\n" +
                "UNIT-III Boilers:\n" +
                "Classifications and working of boilers, boiler mountings and accessories, Draught and its calculations, air pre heater, feed water heater, super heater. Boiler efficiency, Equivalent evaporation. Boiler trial and heat balance.Condenser: Classification of condenser, air leakage, condenser performance parameters.\n\n" +
                "UNIT-IV Steam and Gas Nozzles: \n" +
                "Flow through Convergent and convergent-divergent nozzles, variation of velocity, area and specific volume, Choked flow, throat area, Nozzle efficiency,Off design operation of nozzle, Shock wavesstationary normal shock waves, Effect of friction on nozzle, Super saturated flow. Steam Turbines : Classification of steam turbine, Impulse and Reaction turbines, Staging, Stage and Overall efficiency, Reheat factor, Bleeding, Velocity diagram of simple and compound multistage impulse and reaction turbines and related calculations, work done, efficiencies of reaction, Impulse reaction turbines, state point locus, Losses in steam turbines, Governing of turbines, Comparison with steam engine.\n\n" +
                "UNIT-V Gas Turbine: \n" +
                "Gas turbine classification, Brayton cycle, Principles of gas turbine, Gas turbine cycles with intercooling, reheat and regeneration and their combinations, Stage efficiency, Polytropic efficiency. Deviation of actual cycles from ideal cycles.\n" +
                "Jet Propulsion: Introduction to the principles of jet propulsion, Turbojet and turboprop engines and their processes, Principle of rocket propulsion, Introduction to Rocket Engine. ";

        athermo.add(athremo1);
        expandableListDetail.put("MATHEMATICS –III",mt3);
        expandableListDetail.put("MATERIAL SCIENCE", ms1);
        expandableListDetail.put("FLUID MECHANICS", fm1);
        expandableListDetail.put("THERMODYNAMICS", thermo);
        expandableListDetail.put("MECHANICS OF SOLIDS", mos1);
        expandableListDetail.put("ELECTRICAL MACHINES & CONTROLS", emc);
        expandableListDetail.put("MEASUREMENT AND METROLOGY",mam);
        expandableListDetail.put("MANUFACTURING SCIENCE & TECHNOLOGY-I", mst1);
        expandableListDetail.put("APPLIED THERMODYNAMICS", athermo);
        return expandableListDetail;
    }
}
