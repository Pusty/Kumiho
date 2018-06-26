# Kumiho

Repository for a packer/protector for Windows Executables written in Java and Assembler.

The Project consists out of the following libraries:

- F0xCv2 - The main cross compiler project
- F0xCRT - Runtime for F0xCv2 binaries (contains modified Java Runtime functionality and Windows low level wrapper)
- F0Cr   - A Java Class reader and parser library
- F0xDc  - A Windows Executable Reader, Parser and Writer
- F0x86  - A basic x86 32bit and 64bit assembler

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
- Increasing modularity
- A better setup for test cases
- Changing from FASM to F0x86 as an assembler engine when ready
- Add 64bit support
- Documentation

### F0xCRT
- Make low level wrapper functions not depend on 32bit address size
- Include libc wrapper and helper functions here
- Test all functions
- Change code base for the java runtime to openjdk code for licence reasons
- Documentation

### F0Cr
- Upgrade to latest version (current version doesn't run)
- Documentation

### F0xDc
- Cleanup
- General testing
- Documentation

### F0x86
- Add floating point operation
- Separate 32bit and 64bit assembling
- Integrate F0xDc for Windows Executable Output
- General testing
- Documentation
