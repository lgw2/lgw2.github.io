---
layout: page-with-nav
title: ""
permalink: /research/
nav: true
nav_order: 4
---

Our research explores novel algorithmic solutions to problems in various application areas, especially bioinformatics.

<div class="project-grid">
  <div class="project-card">
    <div class="project-image">
      <img src="/images/transcription_to_multiflow.png" alt="FindViralStrains project image">
    </div>
    <div class="project-content">
      <h3>Flow decomposition for multiassembly</h3>
      <p class="project-description">We investigate novel algorithmic approaches for decomposing flows in the context of assembling multiple genomes from short-read data.</p>
      <p class="project-linkline"><a href="https://github.com/UM-Applied-Algorithms-Lab/FindViralStrains" target="_blank" rel="noopener noreferrer">Repository link</a></p>
    </div>
  </div>

  <div class="project-card">
    <div class="project-image">
      <img src="/images/ptms-to-pathways-logo.png" alt="PTMS2PATHWAYS project image">
    </div>
    <div class="project-content">
      <h3>PTMS2PATHWAYS</h3>
      <p class="project-description">We develop and maintain an open-source R package for mapping post-translational modifications to networks of genes and cellular signaling pathways using mass spectrometry data.</p>
      <p class="project-linkline"><a href="https://github.com/UM-Applied-Algorithms-Lab/PTMsToPathways" target="_blank" rel="noopener noreferrer">Repository link</a></p>
    </div>
  </div>
</div>

<style>
.project-grid {
  display: flex;
  flex-direction: column;
  gap: 1.15rem;
  margin: 1.5rem 0;
}

.project-card {
  display: grid;
  grid-template-columns: 280px 1fr;
  align-items: stretch;
  border: 1px solid #dcd3c4;
  border-radius: 0.9rem;
  overflow: hidden;
  background: linear-gradient(180deg, #fff 0%, #fbf7f0 100%);
  transition: transform 0.2s ease, box-shadow 0.2s ease, border-color 0.2s ease;
}

.project-card:hover,
.project-card:focus-visible {
  transform: translateY(-2px);
  border-color: #b58b72;
  box-shadow: 0 12px 24px rgba(66, 40, 20, 0.14);
}

.project-image {
  min-height: 200px;
  overflow: hidden;
}

.project-image img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.project-content {
  display: flex;
  flex-direction: column;
  justify-content: center;
  padding: 1.25rem 1.4rem;
}

.project-content h3 {
  margin: 0 0 0.55rem;
  font-size: 1.35rem;
}

.project-description {
  margin: 0;
  font-size: 1.03rem;
  line-height: 1.55;
}

.project-linkline {
  margin: 0.7rem 0 0;
}

.project-linkline a {
  font-weight: 600;
}

@media (max-width: 640px) {
  .project-card {
    grid-template-columns: 1fr;
  }

  .project-image {
    min-height: 170px;
    max-height: 220px;
  }

  .project-content {
    padding: 1rem 1.05rem 1.1rem;
  }
}
</style>
