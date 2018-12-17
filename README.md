# Kumiho

Repository for a packer/protector for Windows Executables written in Java and Assembler.

The Project consists out of the following libraries:

- F0xCv2 - The main cross compiler project
- F0xCRT - Runtime for F0xCv2 binaries (contains modified Java Runtime functionality and Windows low level wrapper)
- F0xCRT32 - x86 32bit specific code of the Runtime
- F0xCRT64 - x86 64bit specific code of the Runtime
- F0xExample - General test cases and examples (containg Kumiho)
- F0Cr   - A Java Class File reader and parser library
- F0xDc  - A Windows Executable Reader, Parser and Writer
- F0x86  - A basic x86 32bit and 64bit assembler and disassembler

## TODO List:

### General
- Creating a list of anti-debugging, anti-reversing and anti-vm features
    - https://github.com/LordNoteworthy/al-khaser
    - https://github.com/a0rtega/pafish
    - CRC/hash/integrity checks
- Choose and implement encryption methods
    - XOR?
    - RC4?
    - (X)TEA?
    - AES?
- Choose and implement compression methods
    - LMZA?
    - QuickLZ?
    - LZ4?
    - zlib?
- Implementing wrappers for .NET loading
- Writing code specific for building a stub and including a target
- GUI/CLI for choosing build options

### F0xCv2
- Changing from FASM to F0x86 as an assembler engine when ready
- Documentation

### F0xCRT
- Test all functions
- Add support for more niche functions and default libraries
- Change code base for the java runtime to openjdk code for licence reasons
- Documentation

### F0Cr
- Documentation

### F0xDc
- Cleanup
- General testing
- Documentation

### F0x86
- Separate 32bit and 64bit assembling
- Speed even more up
- Integrate F0xDc for Windows Executable Output
- General testing
- Documentation
