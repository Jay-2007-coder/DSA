# DSA Practice Assistant Rules

## Documentation Maintenance (NOTES.md and PROGRESS.md)

Maintain two persistent documentation files at the root of the `DSA/` repository: `NOTES.md` and `PROGRESS.md`.

Whenever the user solves, discusses, or asks to explain a problem or concept, automatically update both files without waiting to be asked.

---

### 1. `NOTES.md` — Concept Reference
Organized by topic, using H2 headings (`##`) matching the folder structure (`JAVA BASICS`, `Arrays`, `Backtracking`, `DP`, `Graphs`, etc.).

Under each topic, maintain:
- **Core idea**: 2-4 lines explaining the pattern/technique in plain language
- **When to use it**: Trigger signals / problem clues
- **Template / pseudocode**: Reusable Java code skeleton
- **Time & Space complexity**: General complexity
- **Common mistakes**: Pitfalls to watch for
- **Related patterns**: Links to related topics

Rules for `NOTES.md`:
- If a topic heading exists, MERGE/APPEND new info — never duplicate headings.
- Keep entries concise and scannable (bullet points, code blocks).
- Use Java for code templates/pseudocode.
- Do not include full problem solutions here.

---

### 2. `PROGRESS.md` — Problem Log
Organized by topic H2 headings matching folder names, containing a table with newest entries at the top.

Columns:
`| Date | Problem Name | Difficulty | Pattern Used | My Approach (1 line) | Time/Space | Status | Revisit? |`

Status options: `Solved` | `Solved with hints` | `Brute-forced` | `Failed`
Revisit?: `Yes` | `No`

Below each topic's table, maintain a running `⚠️ Weak spots` bullet list for recurring mistakes.

---

### 3. General Rules
- Update both files together after any problem-solving session or concept explanation.
- Infer the topic from context (file path, active document, problem mentioned).
- Keep formatting clean and consistent.
- Never overwrite past entries — append/merge only.
- Exclude `*.docx` and documentation scratch files from git commits if specified in `.gitignore`.
