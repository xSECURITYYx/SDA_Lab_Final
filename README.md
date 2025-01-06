The code is Simple, Just simply run the main.java and it run Smoothly

Architecture Used:

1. Model Layer:
   - The diagram defines models for `Schedule`, `Device`, `Energy Usage`, and `Database`.
   - Each model has attributes and methods (like `TurnOn()`, `TurnOff()`, `logUsage()`).

2. Encapsulation of Responsibilities:
   - Each class encapsulates its own data and operations, such as `Device` managing its own state (`status`) and operations (`TurnOn`, `TurnOff`).

3. Separation of Concerns (SoC):
   - `Device`, `Schedule`, `Energy Usage`, and `Database` have clearly separated roles and interact through defined methods.
   - The `Database` class handles persistence (Save, Update, Fetch).

4. Data-Centric Design:
   - The diagram focuses heavily on data models and their relationships, a characteristic of MDA.

This architecture is often used in IoT systems and energy management applications, where devices, schedules, and energy usage need to be modeled and tracked separately.
