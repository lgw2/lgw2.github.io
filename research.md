---
layout: page-with-nav
title: "Research"
permalink: /research/
nav: true
nav_order: 4
---

Our projects foocus on developing computational methods and algorithmic advances in various application areas.

<div class="project-grid">
  <a class="project-card" href="https://github.com/UM-Applied-Algorithms-Lab/FindViralStrains" target="_blank" rel="noopener noreferrer" aria-label="Open FindViralStrains repository">
    <div class="project-image">
      <img src="/images/fakeimage.png" alt="FindViralStrains project image">
    </div>
    <div class="project-content">
      <h3>FindViralStrains</h3>
      <p class="project-keywords"><strong>Keywords:</strong> Viral genomics, Integer Linear Programming, Flow decomposition</p>
      <p class="project-description">Using novel algorithms for decomposing flows to accurately assemble viral genomes from short read metagenomic data.</p>
      <span class="project-link">View Repository →</span>
    </div>
  </a>

  <a class="project-card" href="https://github.com/UM-Applied-Algorithms-Lab/PTMsToPathways" target="_blank" rel="noopener noreferrer" aria-label="Open PTMS2PATHWAYS repository">
    <div class="project-image">
      <img src="/images/ptms-to-pathways-logo.png" alt="PTMS2PATHWAYS project image">
    </div>
    <div class="project-content">
      <h3>PTMS2PATHWAYS</h3>
      <p class="project-keywords"><strong>Keywords:</strong> Cell signaling pathways, Mass spectrometry, R, Phosphoproteomics</p>
      <p class="project-description">Implementing computational methods to map post-translational modifications to cellular signaling pathways using mass spectrometry data.</p>
      <span class="project-link">View Repository →</span>
    </div>
  </a>
</div>

<style>
.project-grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
  gap: 1.25rem;
  margin: 1.25rem 0;
}

.project-card {
  display: block;
  border: 1px solid #e5e7eb;
  border-radius: 0.75rem;
  overflow: hidden;
  text-decoration: none;
  color: inherit;
  background: #fff;
  transition: transform 0.2s ease, box-shadow 0.2s ease;
}

.project-card:hover,
.project-card:focus-visible {
  transform: translateY(-3px);
  box-shadow: 0 8px 18px rgba(0, 0, 0, 0.08);
}

.project-image {
  height: 180px;
  overflow: hidden;
}

.project-image img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.project-content {
  padding: 1rem;
}

.project-content h3 {
  margin: 0 0 0.35rem;
}

.project-keywords {
  margin: 0 0 0.5rem;
}

.project-description {
  margin: 0 0 0.75rem;
}

.project-link {
  font-weight: 600;
}

@media (max-width: 640px) {
  .project-image {
    height: 160px;
  }
}
</style>
