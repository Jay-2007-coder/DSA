# DSA Practice & Auto-Documentation Rules

## Automatic Reference Document Maintenance (`Java_Notes.docx` and `Java_Doubts.docx`)

Maintain two local Word reference documents in the root of `DSA/`:
1. `Java_Notes.docx` — Structured notes, topic concepts, templates, complexities, and rules.
2. `Java_Doubts.docx` — Log of questions, doubts, edge-cases, and explanations discussed.

### Automatic Action Rules:
- **Whenever the user writes code, practices a problem, or modifies a file** in the IDE:
  - Automatically update `Java_Notes.docx` with the new concept, syntax, pattern, or algorithm covered.
- **Whenever the user asks a question, raises a doubt, or gets an error explained**:
  - Automatically append an entry to `Java_Doubts.docx` with their question, full explanation, code example, and pitfalls.
- **Do NOT wait for the user to ask** to update these files — do it proactively during or at the end of every interaction.

### Alignment & Formatting Rules:
- Main Document Title & Subtitle: Centered at the top.
- All Headings, Subheadings, Body Text, Bullets, and Code Blocks: Strictly **Left-Aligned**.
- Bullets: Indented 18pt.
- Code Blocks: Monospace Consolas font with 24pt left indent.
- `*.docx` files are listed in `.gitignore` and must **not** be pushed to GitHub unless explicitly requested.
