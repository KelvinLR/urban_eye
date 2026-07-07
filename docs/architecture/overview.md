# Architecture Overview

UrbanEye follows **Clean Architecture** with a **feature-first** package organization.

## Layers

- **Domain**: Pure Kotlin business logic — models, repository interfaces, use cases.
- **Data**: Framework-dependent implementations — Retrofit services, Room DAOs, repository implementations.
- **Presentation**: Jetpack Compose UI — screens, ViewModels, UI state, events.

## Dependency Rule

Dependencies always point inward: Presentation → Domain ← Data.

The Domain layer has zero framework dependencies.

## Key Patterns

- MVVM with Unidirectional Data Flow
- Repository Pattern
- Use Cases (single responsibility)
- Dependency Injection via Hilt

See `/docs/adr/` for Architecture Decision Records.
